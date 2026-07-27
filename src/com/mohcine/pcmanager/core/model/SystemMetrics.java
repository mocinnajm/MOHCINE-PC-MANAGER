package com.mohcine.pcmanager.core.model;

public class SystemMetrics {

    private final double memoryUsedPercentage;
    private final double memoryFreePercentage;

    private final double diskUsedPercentage;
    private final double diskFreePercentage;


    public SystemMetrics(
            double memoryUsedPercentage,
            double memoryFreePercentage,
            double diskUsedPercentage,
            double diskFreePercentage) {

        this.memoryUsedPercentage = memoryUsedPercentage;
        this.memoryFreePercentage = memoryFreePercentage;
        this.diskUsedPercentage = diskUsedPercentage;
        this.diskFreePercentage = diskFreePercentage;

    }


    public double getMemoryUsedPercentage() {
        return memoryUsedPercentage;
    }


    public double getMemoryFreePercentage() {
        return memoryFreePercentage;
    }


    public double getDiskUsedPercentage() {
        return diskUsedPercentage;
    }


    public double getDiskFreePercentage() {
        return diskFreePercentage;
    }

}