package com.mycompany.facade;

public class ReportFacade {
    public void generateAndSendReport(String format, CustomizationOptions options, String notificationMethod) {
        ReportGenerator generator = getReportGenerator(format);
        Reporte report = (Reporte) generator.generateReport();

        // Aplicar opciones de personalización
        report.applyCustomization(options);

        INotificacionService notificationService = getNotificationService(notificationMethod);
        notificationService.send(report);
    }
    
    //NOTA IMPORTANTE: Estos métodos no figuran en el diagrama de clase por ser de tipo privado por lo que solo sirven para obtener la instancia necesaria para el método principal

    private ReportGenerator getReportGenerator(String format) {
        switch (format.toLowerCase()) {
            case "pdf":
                return new PDFReportGenerator();
            case "excel":
                return new ExcelReportGenerator();
            case "word":
                return new WordReportGenerator();
            default:
                throw new IllegalArgumentException("Formato de reporte inválido: " + format);
        }
    }

    private INotificacionService getNotificationService(String method) {
        switch (method.toLowerCase()) {
            case "email":
                return new EmailNotificationService();
            case "whatsapp":
                return new WhatsAppNotificationService();
            case "telegram":
                return new TelegramNotificationService();
            default:
                throw new IllegalArgumentException("Método de notificación inválido: " + method);
        }
    }
    
}
