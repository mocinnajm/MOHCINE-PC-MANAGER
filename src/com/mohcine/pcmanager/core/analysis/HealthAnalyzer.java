package com.mohcine.pcmanager.core.analysis;

import com.mohcine.pcmanager.core.model.HealthStatus;
import com.mohcine.pcmanager.core.model.SystemMetrics;

public class HealthAnalyzer {


    private static final double MEMORY_EXCELLENT_LIMIT = 70.0;
    private static final double MEMORY_WARNING_LIMIT = 85.0;

    private static final double DISK_EXCELLENT_LIMIT = 30.0;
    private static final double DISK_WARNING_LIMIT = 10.0;


    private final SystemMetrics metrics;


    public HealthAnalyzer(SystemMetrics metrics) {

        this.metrics = metrics;

    }


    public HealthStatus analyzeMemory() {

        double memoryUsed = metrics.getMemoryUsedPercentage();


        if (memoryUsed < MEMORY_EXCELLENT_LIMIT) {

            return HealthStatus.EXCELLENT;

        }


        if (memoryUsed < MEMORY_WARNING_LIMIT) {

            return HealthStatus.WARNING;

        }


        return HealthStatus.CRITICAL;

    }



    public HealthStatus analyzeDisk() {

        double diskFree = metrics.getDiskFreePercentage();


        if (diskFree > DISK_EXCELLENT_LIMIT) {

            return HealthStatus.EXCELLENT;

        }


        if (diskFree > DISK_WARNING_LIMIT) {

            return HealthStatus.WARNING;

        }


        return HealthStatus.CRITICAL;

    }

}
