package com.mohcine.pcmanager.core.system;

public class MemoryInfo {

    private final Runtime runtime;

    public MemoryInfo() {
        runtime = Runtime.getRuntime();
    }

    public long getTotalMemory() {
        return runtime.totalMemory();
    }

    public long getFreeMemory() {
        return runtime.freeMemory();
    }

    public long getUsedMemory() {
        return getTotalMemory() - getFreeMemory();
    }

    private long bytesToMB(long bytes) {
        return bytes / 1024 / 1024;
    }

    public long getTotalMemoryMB() {
        return bytesToMB(getTotalMemory());
    }

    public long getFreeMemoryMB() {
        return bytesToMB(getFreeMemory());
    }

    public long getUsedMemoryMB() {
        return bytesToMB(getUsedMemory());
    }
    public double getUsedMemoryPercentage() {

        return (getUsedMemory() * 100.0) / getTotalMemory();

}
    public double getFreeMemoryPercentage() {

        return (getFreeMemory() * 100.0) / getTotalMemory();

}

}