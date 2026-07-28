package com.mohcine.pcmanager.core.model;

public enum HealthStatus {

    EXCELLENT("Excelente"),
    GOOD("Bueno"),
    WARNING("Advertencia"),
    CRITICAL("Crítico");


    private final String description;


    HealthStatus(String description) {

        this.description = description;

    }


    public String getDescription() {

        return description;

    }

}
