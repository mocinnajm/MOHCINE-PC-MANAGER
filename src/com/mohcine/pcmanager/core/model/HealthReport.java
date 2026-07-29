package com.mohcine.pcmanager.core.model;

public class HealthReport {

    private final HealthStatus status;
    private final String message;
    private final double value;


    public HealthReport(
            HealthStatus status,
            String message,
            double value) {

        this.status = status;
        this.message = message;
        this.value = value;
    }


    public HealthStatus getStatus() {
        return status;
    }


    public String getMessage() {
        return message;
    }


    public double getValue() {
        return value;
    }
}