import os
import re
import shutil
import subprocess
from pathlib import Path

# Root of the project (script location)
PROJECT_ROOT = Path(__file__).resolve().parent

# Source code directory containing java packages
SRC_MAIN_DIR = PROJECT_ROOT / "src"

# Compiled .class files int out folder
OUT_DIR = PROJECT_ROOT / "out"

# Generated Randoop files placed in the Randoop test folder
TEST_RANDOOP_DIR = PROJECT_ROOT / "src" / "test" / "Randoop"

# Library folder containing junit + randoop jar
LIB_DIR = PROJECT_ROOT / "lib"

# Path to Randoop jar
RANDOOP_JAR = LIB_DIR / "randoop-all-4.3.4.jar"

# Packages For Randoop to automatically scan.
AUTO_SCAN_PACKAGES = [
    "com.yorku.lab.model",
    "com.yorku.lab.pattern.state",
    "com.yorku.lab.pattern.strategy",
    "com.yorku.lab.repository",
    "com.yorku.lab.service",
]

# Classes we explicitly skip when scanning
# (for example main entry point classes)
SKIP_CLASS_NAMES = {
    "Main",
}

# Default filenames that Randoop generates
GENERATED_FILENAMES = [
    "RegressionTest.java",
    "RegressionTest0.java",
]


def run_command(cmd, cwd=None):
    """
    Helper function to execute shell commands.
    Prints the command, captures output, and throws an error if it fails.
    """
    print("\nRUNNING:", " ".join(str(c) for c in cmd))
    result = subprocess.run(cmd, cwd=cwd, capture_output=True, text=True)

    if result.stdout:
        print(result.stdout)

    if result.stderr:
        print(result.stderr)

    if result.returncode != 0:
        raise RuntimeError(f"Command failed with exit code {result.returncode}")

    return result


def compile_source():
    """
    Compiles all Java source files in src (excluding tests).
    Output .class files are placed into /out.
    """

    java_files = [str(p) for p in SRC_MAIN_DIR.rglob("*.java") if f"{os.sep}test{os.sep}" not in str(p)]

    if not java_files:
        raise FileNotFoundError("No Java source files found under src")

    OUT_DIR.mkdir(exist_ok=True)

    cmd = [
        "javac",
        "-cp",
        f"{LIB_DIR}{os.sep}*",
        "-d",
        str(OUT_DIR),
    ] + java_files

    run_command(cmd)


def package_name_of(full_class_name: str) -> str:
    """Returns the package portion of a fully qualified class name."""
    return ".".join(full_class_name.split(".")[:-1])


def class_simple_name(full_class_name: str) -> str:
    """Returns just the class name without the package."""
    return full_class_name.split(".")[-1]


def class_to_package_path(full_class_name: str) -> Path:
    """
    Converts a Java package name to a directory path
    where generated tests should be stored.
    """
    package_parts = full_class_name.split(".")[:-1]
    return TEST_RANDOOP_DIR.joinpath(*package_parts)


def clean_generated_root_files():
    """
    Randoop generates files in the project root.
    We delete any previous ones before generating new tests.
    """
    for name in GENERATED_FILENAMES:
        p = PROJECT_ROOT / name
        if p.exists():
            p.unlink()


def clean_existing_dest_files(dest_dir: Path, prefix: str):
    """
    Removes old generated tests for a class before creating new ones.
    """
    for name in [
        f"{prefix}RegressionTest.java",
        f"{prefix}RegressionTest0.java",
    ]:
        p = dest_dir / name
        if p.exists():
            p.unlink()


def full_class_name_from_file(java_file: Path) -> str:
    """
    Extracts the full package + class name from a Java file.
    """
    text = java_file.read_text(encoding="utf-8", errors="ignore")

    package_match = re.search(
        r"^\s*package\s+([a-zA-Z0-9_.]+)\s*;",
        text,
        re.MULTILINE
    )

    if not package_match:
        raise ValueError(f"Could not determine package for {java_file}")

    package_name = package_match.group(1)

    return f"{package_name}.{java_file.stem}"


def is_skippable_source(java_file: Path) -> bool:
    """
    Filters out classes that Randoop should not try to test.
    Example: interfaces, enums, abstract classes, etc.
    """
    text = java_file.read_text(encoding="utf-8", errors="ignore")

    simple_name = java_file.stem

    if simple_name in SKIP_CLASS_NAMES:
        return True

    if re.search(r"\binterface\b", text):
        return True

    if re.search(r"\benum\b", text):
        return True

    if re.search(r"@interface\b", text):
        return True

    if re.search(r"\babstract\s+class\b", text):
        return True

    if not re.search(rf"\bclass\s+{re.escape(simple_name)}\b", text):
        return True

    return False


def discover_target_classes():
    """
    Scans selected packages and builds a list of classes
    that will be used as Randoop test targets.
    """

    discovered = []

    for package_name in AUTO_SCAN_PACKAGES:

        package_dir = SRC_MAIN_DIR.joinpath(*package_name.split("."))

        if not package_dir.exists():
            continue

        for java_file in package_dir.rglob("*.java"):

            if is_skippable_source(java_file):
                continue

            discovered.append(full_class_name_from_file(java_file))

    return sorted(set(discovered))


def rewrite_generated_file_content(content: str, prefix: str, package_line: str) -> str:
    """
    Randoop generates generic test class names like RegressionTest.
    We rename them per target class.
    """

    if content.startswith("package "):
        lines = content.splitlines(keepends=True)
        lines[0] = package_line
        content = "".join(lines)
    else:
        content = package_line + content

    content = re.sub(
        r"\bpublic\s+class\s+RegressionTest0\b",
        f"public class {prefix}RegressionTest0",
        content,
    )

    content = re.sub(
        r"\bpublic\s+class\s+RegressionTest\b",
        f"public class {prefix}RegressionTest",
        content,
    )

    content = re.sub(r"\bRegressionTest0\.class\b", f"{prefix}RegressionTest0.class", content)

    return content


def move_and_fix_generated_files(full_class_name: str):
    """
    Moves generated tests from project root into the correct
    package directory and updates class names.
    """

    dest_dir = class_to_package_path(full_class_name)
    dest_dir.mkdir(parents=True, exist_ok=True)

    prefix = class_simple_name(full_class_name)

    package_line = f"package test.Randoop.{package_name_of(full_class_name)};\n\n"

    clean_existing_dest_files(dest_dir, prefix)

    file_map = {
        "RegressionTest.java": f"{prefix}RegressionTest.java",
        "RegressionTest0.java": f"{prefix}RegressionTest0.java",
    }

    for src_name, dest_name in file_map.items():

        src_file = PROJECT_ROOT / src_name

        if src_file.exists():

            content = src_file.read_text(encoding="utf-8", errors="ignore")

            content = rewrite_generated_file_content(content, prefix, package_line)

            dest_file = dest_dir / dest_name

            dest_file.write_text(content, encoding="utf-8")

            src_file.unlink()

            print(f"Moved: {src_name} -> {dest_file}")


def generate_for_class(full_class_name: str):
    """
    Runs Randoop for a specific class and processes the generated tests.
    """

    print(f"\n=== GENERATING TESTS FOR {full_class_name} ===")

    clean_generated_root_files()

    cmd = [
        "java",
        "-cp",
        f"{OUT_DIR}{os.pathsep}{LIB_DIR}{os.sep}*",
        "randoop.main.Main",
        "gentests",
        f"--testclass={full_class_name}",
        "--time-limit=25",
        "--output-limit=300",
        "--null-ratio=0.35",
    ]

    run_command(cmd)

    move_and_fix_generated_files(full_class_name)


def compile_generated_tests():
    """
    Compiles all generated Randoop test files.
    """

    java_files = [str(p) for p in TEST_RANDOOP_DIR.rglob("*.java")]

    if not java_files:
        print("No generated Randoop test files found to compile.")
        return

    cmd = [
        "javac",
        "-cp",
        f"{OUT_DIR}{os.pathsep}{LIB_DIR}{os.sep}*",
        "-d",
        str(OUT_DIR),
    ] + java_files

    run_command(cmd)


def main():
    """
    Main workflow:
    1. Compile project source
    2. Discover classes to test
    3. Generate Randoop tests
    4. Compile generated tests
    """

    if not RANDOOP_JAR.exists():
        raise FileNotFoundError(f"Missing Randoop jar: {RANDOOP_JAR}")

    TEST_RANDOOP_DIR.mkdir(parents=True, exist_ok=True)

    compile_source()

    target_classes = discover_target_classes()

    if not target_classes:
        raise RuntimeError("No target classes discovered for Randoop generation.")

    print("\nDISCOVERED TARGET CLASSES:")

    for cls in target_classes:
        print(" -", cls)

    for full_class_name in target_classes:
        generate_for_class(full_class_name)

    compile_generated_tests()

    print("\nDone. Randoop tests have been generated and compiled.")


if __name__ == "__main__":
    main()