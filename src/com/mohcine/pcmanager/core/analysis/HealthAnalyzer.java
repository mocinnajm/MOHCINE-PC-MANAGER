package com.mohcine.pcmanager.core.analysis;

import com.mohcine.pcmanager.core.model.SystemMetrics;

public class HealthAnalyzer {

    private final SystemMetrics metrics;


    public HealthAnalyzer(SystemMetrics metrics) {
        this.metrics = metrics;
    }


    public String analyzeMemory() {

        if (metrics.getMemoryUsedPercentage() < 70) {
            return "Memoria: Excelente";
        }

        return "Memoria: Revisar consumo";
    }



    public String analyzeDisk() {

        if (metrics.getDiskFreePercentage() > 30) {
            return "Disco: Excelente";
        }

        return "Disco: Poco espacio libre";
    }

}