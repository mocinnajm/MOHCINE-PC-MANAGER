package com.mohcine.pcmanager.core.system;
import java.io.File;


public class SystemInfo {

    private String computerName;
    private String userName;
    private String operatingSystem;
    private String architecture;
    private String javaVersion;
    private MemoryInfo memoryInfo;
    private DiskInfo diskInfo;

    public SystemInfo() {
        this.computerName = System.getenv("COMPUTERNAME");
        this.userName = System.getProperty("user.name");
        this.operatingSystem = System.getProperty("os.name");
        this.architecture = System.getProperty("os.arch");
        this.javaVersion = System.getProperty("java.version");
        this.memoryInfo = new MemoryInfo();
        this.diskInfo = new DiskInfo();
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
        
        System.out.println();
        System.out.println("----- MEMORIA JVM -----");

        System.out.println("Memoria Total : "
        + memoryInfo.getTotalMemoryMB() + " MB");

        System.out.println("Memoria Libre : "
        + memoryInfo.getFreeMemoryMB() + " MB");

        System.out.println("Memoria Usada : "
        + memoryInfo.getUsedMemoryMB() + " MB");

        diskInfo.getTotalSpaceGB();
        diskInfo.getFreeSpaceGB();

        System.out.println();
        System.out.println("----- DISCO -----");
        System.out.println("Unidad        : C:\\");

        System.out.println("Espacio Total : "
        + diskInfo.getTotalSpaceGB() + " GB");

        System.out.println("Espacio Libre : "
        + diskInfo.getFreeSpaceGB() + " GB");
    }
}