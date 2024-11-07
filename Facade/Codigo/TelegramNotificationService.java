package com.mycompany.facade;

public class TelegramNotificationService implements INotificacionService {
    @Override
    public void send(Reporte report) {
        System.out.println("Enviando reporte por Telegram...");
    }
}