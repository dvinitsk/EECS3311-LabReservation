#!/bin/bash
# Compile the project
mkdir -p out
javac -d out -sourcepath src src/com/yorku/lab/Main.java
echo "Exit: $?"
