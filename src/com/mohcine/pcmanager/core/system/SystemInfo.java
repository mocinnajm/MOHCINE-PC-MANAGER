package com.mohcine.pcmanager.core.system;

public class SystemInfo {

    private String computerName;
    private String userName;
    private String operatingSystem;
    private String architecture;
    private String javaVersion;

    public SystemInfo() {
        this.computerName = System.getenv("COMPUTERNAME");
        this.userName = System.getProperty("user.name");
        this.operatingSystem = System.getProperty("os.name");
        this.architecture = System.getProperty("os.arch");
        this.javaVersion = System.getProperty("java.version");
    }

    public void showInfo() {

        System.out.println("==============================");
        System.out.println(" MOHCINE PC MANAGER");
        System.out.println(" SYSTEM INFORMATION");
        System.out.println("==============================");

        System.out.println("Equipo: " + computerName);
        System.out.println("Usuario: " + userName);
        System.out.println("Sistema: " + operatingSystem);
        System.out.println("Arquitectura: " + architecture);
        System.out.println("Java: " + javaVersion);
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory() / (1024 * 1024);
        long freeMemory = runtime.freeMemory() / (1024 * 1024);
        long usedMemory = totalMemory - freeMemory;

        System.out.println();
        System.out.println("----- MEMORIA JVM -----");
        System.out.println("Memoria Total : " + totalMemory + " MB");
        System.out.println("Memoria Libre : " + freeMemory + " MB");
        System.out.println("Memoria Usada : " + usedMemory + " MB");
    }
}