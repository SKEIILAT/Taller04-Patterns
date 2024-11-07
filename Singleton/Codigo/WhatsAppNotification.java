/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author henry
 */
public class WhatsAppNotification implements NotificationType {
    private String recipientNumber;

    public WhatsAppNotification(String recipientNumber) {
        this.recipientNumber = recipientNumber;
    }
    
    @Override
    public void send(String content) {
        System.out.println("Enviando mensaje a: " + recipientNumber);
        System.out.println("Contenido: " + content);
    }
}
