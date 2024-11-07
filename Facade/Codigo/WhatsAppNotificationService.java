package com.mycompany.facade;
public class WhatsAppNotificationService implements INotificacionService {
    @Override
    public void send(Reporte report) {
        System.out.println("Enviando reporte por WhatsApp...");
    }
}