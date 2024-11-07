package com.mycompany.facade;

public class ExcelReportGenerator implements ReportGenerator {
    @Override
    public Reporte generateReport() {
        System.out.println("Generando reporte Excel...");
        return new ExcelReport();
    }
}