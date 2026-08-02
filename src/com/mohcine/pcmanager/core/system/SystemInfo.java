package com.mohcine.pcmanager.core.system;

import com.mohcine.pcmanager.core.analysis.HealthAnalyzer;
import com.mohcine.pcmanager.core.model.SystemMetrics;
import com.mohcine.pcmanager.core.model.HealthReport;

public class SystemInfo {

        private String computerName;
        private String userName;
        private String operatingSystem;
        private String architecture;
        private String javaVersion;

        private MemoryInfo memoryInfo;
        private DiskInfo diskInfo;
        private CPUInfo cpuInfo;
        private DateTimeInfo dateTimeInfo;

        public SystemInfo() {

                this.computerName = System.getenv("COMPUTERNAME");
                this.userName = System.getProperty("user.name");
                this.operatingSystem = System.getProperty("os.name");
                this.architecture = System.getProperty("os.arch");
                this.javaVersion = System.getProperty("java.version");

                this.memoryInfo = new MemoryInfo();
                this.diskInfo = new DiskInfo();
                this.cpuInfo = new CPUInfo();
                this.dateTimeInfo = new DateTimeInfo();
        }

        public void showInfo() {
                SystemSummary summary = new SystemSummary();
                summary.addLine("==============================");
                summary.addLine(" MOHCINE PC MANAGER");
                summary.addLine(" SYSTEM INFORMATION");
                summary.addLine("==============================");
                summary.addLine("Fecha y hora: "
                                + dateTimeInfo.getCurrentDateTime());

                summary.addLine("");

                summary.addLine("Equipo: " + computerName);
                summary.addLine("Usuario: " + userName);
                summary.addLine("Sistema: " + operatingSystem);
                summary.addLine("Arquitectura: " + architecture);
                summary.addLine("Java: " + javaVersion);

                System.out.println();
                System.out.println("===== PRUEBA SYSTEM SUMMARY =====");
                System.out.println(summary);

                System.out.println("----- MEMORIA JVM -----");
                summary.addLine("");
                summary.addLine("----- MEMORIA JVM -----");

                summary.addLine("Memoria Total : "
                                + memoryInfo.getTotalMemoryMB() + " MB");

                summary.addLine("Memoria Libre : "
                                + memoryInfo.getFreeMemoryMB() + " MB");

                summary.addLine("Memoria Usada : "
                                + memoryInfo.getUsedMemoryMB() + " MB");

                summary.addLine("Uso Memoria   : "
                                + String.format("%.2f", memoryInfo.getUsedMemoryPercentage()) + " %");

                summary.addLine("Memoria Libre : "
                                + String.format("%.2f", memoryInfo.getFreeMemoryPercentage()) + " %");

                System.out.println("Memoria Total : "
                                + memoryInfo.getTotalMemoryMB() + " MB");

                System.out.println("Memoria Libre : "
                                + memoryInfo.getFreeMemoryMB() + " MB");

                System.out.println("Memoria Usada : "
                                + memoryInfo.getUsedMemoryMB() + " MB");
                System.out.println("Uso Memoria   : "
                                + String.format("%.2f", memoryInfo.getUsedMemoryPercentage()) + " %");

                System.out.println("Memoria Libre : "
                                + String.format("%.2f", memoryInfo.getFreeMemoryPercentage()) + " %");

                System.out.println();

                System.out.println("----- DISCO -----");

                System.out.println("Unidad        : C:\\");
                summary.addLine("");
                summary.addLine("----- DISCO -----");

                summary.addLine("Unidad        : C:\\");

                summary.addLine("Espacio Total : "
                                + diskInfo.getTotalSpaceGB() + " GB");

                summary.addLine("Espacio Libre : "
                                + diskInfo.getFreeSpaceGB() + " GB");

                summary.addLine("Uso Disco     : "
                                + String.format("%.2f", diskInfo.getUsedDiskPercentage()) + " %");

                summary.addLine("Disco Libre   : "
                                + String.format("%.2f", diskInfo.getFreeDiskPercentage()) + " %");

                System.out.println("Espacio Total : "
                                + diskInfo.getTotalSpaceGB() + " GB");

                System.out.println("Espacio Libre : "
                                + diskInfo.getFreeSpaceGB() + " GB");
                System.out.println("Uso Disco     : "
                                + String.format("%.2f", diskInfo.getUsedDiskPercentage()) + " %");

                System.out.println("Disco Libre   : "
                                + String.format("%.2f", diskInfo.getFreeDiskPercentage()) + " %");
                System.out.println();
                System.out.println("----- CPU -----");
                summary.addLine("");
                summary.addLine("----- CPU -----");
                summary.addLine(cpuInfo.toString());

                System.out.println(cpuInfo);
                /*
                 * Preparar métricas para el análisis
                 */

                SystemMetrics metrics = new SystemMetrics(
                                memoryInfo.getUsedMemoryPercentage(),
                                memoryInfo.getFreeMemoryPercentage(),
                                diskInfo.getUsedDiskPercentage(),
                                diskInfo.getFreeDiskPercentage());

                /*
                 * Analizar estado del equipo
                 */

                HealthAnalyzer analyzer = new HealthAnalyzer(metrics);

                System.out.println();
                System.out.println("----- DIAGNÓSTICO -----");

                HealthReport memoryReport = analyzer.analyzeMemory();
                HealthReport diskReport = analyzer.analyzeDisk();
                summary.addLine("");
                summary.addLine("----- DIAGNÓSTICO -----");

                summary.addLine("Memoria: " + memoryReport.getStatus());
                summary.addLine("Mensaje: " + memoryReport.getMessage());
                summary.addLine("Valor analizado: "
                                + String.format("%.2f", memoryReport.getValue()) + " %");

                summary.addLine("");

                summary.addLine("Disco: " + diskReport.getStatus());
                summary.addLine("Mensaje: " + diskReport.getMessage());
                summary.addLine("Valor analizado: "
                                + String.format("%.2f", diskReport.getValue()) + " %");

                System.out.println("Memoria: "
                                + memoryReport.getStatus());

                System.out.println("Mensaje: "
                                + memoryReport.getMessage());

                System.out.println("Valor analizado: "
                                + String.format("%.2f", memoryReport.getValue())
                                + " %");

                System.out.println();

                System.out.println("Disco: "
                                + diskReport.getStatus());

                System.out.println("Mensaje: "
                                + diskReport.getMessage());

                System.out.println("Valor analizado: "
                                + String.format("%.2f", diskReport.getValue())
                                + " %");
                ReportExporter exporter = new ReportExporter();

                exporter.export(summary.toString());
        }

}