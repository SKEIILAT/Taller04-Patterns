/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author henry
 */
public class TelegramNotification implements NotificationType{
    private String recipientId;
    private String authToken;

    public TelegramNotification(String recipientId, String authToken) {
        this.recipientId = recipientId;
        this.authToken = authToken;
    }
    
    @Override
    public void send(String content) {
        System.out.println("Enviando mensaje a: " + recipientId);
        System.out.println("Token de autorizacion: " + authToken);
        System.out.println("Contenido: " + content);
    }
}
