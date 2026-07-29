package com.mohcine.pcmanager.core.analysis;

import com.mohcine.pcmanager.core.model.HealthReport;
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


    public HealthReport analyzeMemory() {
    
    double memoryUsed = metrics.getMemoryUsedPercentage();

    if (memoryUsed < MEMORY_EXCELLENT_LIMIT) {

        return new HealthReport(
                HealthStatus.EXCELLENT,
                "El consumo de memoria es correcto.",
                memoryUsed
        );

    }


    if (memoryUsed < MEMORY_WARNING_LIMIT) {

        return new HealthReport(
                HealthStatus.WARNING,
                "El consumo de memoria empieza a ser elevado.",
                memoryUsed
        );

    }


    return new HealthReport(
            HealthStatus.CRITICAL,
            "El consumo de memoria es demasiado alto.",
            memoryUsed
    );
}


    public HealthReport analyzeDisk() {

    double diskFree = metrics.getDiskFreePercentage();


    if (diskFree > DISK_EXCELLENT_LIMIT) {

        return new HealthReport(
                HealthStatus.EXCELLENT,
                "Existe suficiente espacio libre en el disco.",
                diskFree
        );

    }


    if (diskFree > DISK_WARNING_LIMIT) {

        return new HealthReport(
                HealthStatus.WARNING,
                "El espacio libre del disco empieza a ser bajo.",
                diskFree
        );

    }


    return new HealthReport(
            HealthStatus.CRITICAL,
            "El disco está cerca de quedarse sin espacio.",
            diskFree
    );
}

}
