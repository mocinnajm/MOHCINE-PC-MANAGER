package com.mohcine.pcmanager.core.system;
import java.io.FileWriter;
import java.io.IOException;

public class ReportExporter {

    public void export(String report) {

    try {

        FileWriter writer = new FileWriter("system_report.txt");

        writer.write(report);

        writer.close();

        System.out.println("Informe guardado correctamente.");

    } catch (IOException e) {

        System.out.println("Error al guardar el informe.");

    }

}

}