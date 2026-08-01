package com.mohcine.pcmanager.core.system;

public class CPUInfo {

    private final String architecture;
    private final int availableProcessors;

    public CPUInfo() {

        this.architecture = System.getProperty("os.arch");
        this.availableProcessors = Runtime.getRuntime().availableProcessors();

    }

    public String getArchitecture() {

        return architecture;

    }

    public int getAvailableProcessors() {

        return availableProcessors;

    }

}