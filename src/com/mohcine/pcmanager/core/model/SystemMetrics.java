package com.mohcine.pcmanager.core.model;

public class SystemMetrics {

    private final long memoryUsedMB;
    private final long diskFreeGB;

    public SystemMetrics(long memoryUsedMB, long diskFreeGB) {
        this.memoryUsedMB = memoryUsedMB;
        this.diskFreeGB = diskFreeGB;
    }

    public long getMemoryUsedMB() {
        return memoryUsedMB;
    }

    public long getDiskFreeGB() {
        return diskFreeGB;
    }
}