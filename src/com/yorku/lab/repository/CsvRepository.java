package com.yorku.lab.repository;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Base class for CSV-based persistence.
 * Subclasses define entity-specific serialization/deserialization.
 */
public abstract class CsvRepository<T> {

    protected abstract String getFileName();
    protected abstract String toCsvLine(T entity);
    protected abstract T fromCsvLine(String line);

    protected Path getDataPath() {
        Path dataDir = Paths.get(System.getProperty("user.dir"), "data").toAbsolutePath();
        try {
            Files.createDirectories(dataDir);
        } catch (IOException e) {
            throw new RuntimeException("Could not create data directory", e);
        }
        return dataDir.resolve(getFileName());
    }

    public List<T> findAll() {
        List<T> results = new ArrayList<>();
        Path path = getDataPath();
        if (!Files.exists(path)) return results;
        try (BufferedReader reader = Files.newBufferedReader(path, java.nio.charset.StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    try {
                        T entity = fromCsvLine(line);
                        if (entity != null) results.add(entity);
                    } catch (Exception e) {
                        System.err.println("Skipping invalid line: " + line);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading " + getFileName() + ": " + e.getMessage());
        }
        return results;
    }

    public void saveAll(List<T> entities) {
        Path path = getDataPath();
        try (BufferedWriter writer = Files.newBufferedWriter(path, java.nio.charset.StandardCharsets.UTF_8)) {
            for (T entity : entities) {
                writer.write(toCsvLine(entity));
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error saving " + getFileName(), e);
        }
    }

    protected String escape(String s) {
        if (s == null) return "";
        return s.replace("|", "\\|").replace("\n", " ");
    }

    protected String unescape(String s) {
        if (s == null) return "";
        return s.replace("\\|", "|");
    }

    protected String[] splitCsv(String line) {
        List<String> parts = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean escaped = false;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (escaped) {
                sb.append(c);
                escaped = false;
            } else if (c == '\\' && i + 1 < line.length() && line.charAt(i + 1) == '|') {
                escaped = true;
            } else if (c == '|') {
                parts.add(unescape(sb.toString()));
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        parts.add(unescape(sb.toString()));
        return parts.toArray(new String[0]);
    }
}
