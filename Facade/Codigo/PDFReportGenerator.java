package com.mycompany.facade;

public class PDFReportGenerator implements ReportGenerator {
    @Override
    public Reporte generateReport() {
        System.out.println("Generando reporte PDF...");
        return new PDFReport();
    }
}