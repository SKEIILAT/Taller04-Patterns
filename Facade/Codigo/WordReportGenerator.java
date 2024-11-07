package com.mycompany.facade;

public class WordReportGenerator implements ReportGenerator {
    @Override
    public Reporte generateReport() {
        System.out.println("Generando reporte Word...");
        return new WordReport();
    }
}