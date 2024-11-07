package com.mycompany.facade;

public class EmailNotificationService implements INotificacionService {
    @Override
    public void send(Reporte report) {
        System.out.println("Enviando reporte por Email...");
    }
}
