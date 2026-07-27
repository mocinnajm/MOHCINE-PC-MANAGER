package com.mohcine.pcmanager.core.analysis;

import com.mohcine.pcmanager.core.model.SystemMetrics;

public class HealthAnalyzer {

    private final SystemMetrics metrics;

    public HealthAnalyzer(SystemMetrics metrics) {
        this.metrics = metrics;
    }

    public String analyzeMemory() {

        if (metrics.getMemoryUsedMB() < 500) {
            return "Memoria: Excelente";
        }

        return "Memoria: Revisar consumo";
    }


    public String analyzeDisk() {

        if (metrics.getDiskFreeGB() > 100) {
            return "Disco: Excelente";
        }

        return "Disco: Poco espacio libre";
    }
}