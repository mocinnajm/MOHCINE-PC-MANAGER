package com.mohcine.pcmanager.core.system;

public class SystemSummary {

    private final StringBuilder summary;

    public SystemSummary() {

        summary = new StringBuilder();

    }

    public void addLine(String text) {

        summary.append(text);
        summary.append(System.lineSeparator());

    }

    @Override
    public String toString() {

        return summary.toString();

    }

}