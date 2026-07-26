package com.mohcine.pcmanager.core.system;
import java.io.File;


public class SystemInfo {

    private String computerName;
    private String userName;
    private String operatingSystem;
    private String architecture;
    private String javaVersion;
    private MemoryInfo memoryInfo;

    public SystemInfo() {
        this.computerName = System.getenv("COMPUTERNAME");
        this.userName = System.getProperty("user.name");
        this.operatingSystem = System.getProperty("os.name");
        this.architecture = System.getProperty("os.arch");
        this.javaVersion = System.getProperty("java.version");
        this.memoryInfo = new MemoryInfo();
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

        System.out.println();
        System.out.println("----- DISCO -----");
        File disk = new File("C:\\");

        long totalDisk = disk.getTotalSpace() / (1024 * 1024 * 1024);
        long freeDisk = disk.getFreeSpace() / (1024 * 1024 * 1024);

        System.out.println("Unidad        : C:\\");
        System.out.println("Espacio Total : " + totalDisk + " GB");
        System.out.println("Espacio Libre : " + freeDisk + " GB");

    }
}