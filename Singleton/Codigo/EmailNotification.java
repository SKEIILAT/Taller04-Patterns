/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author henry
 */
public class EmailNotification implements NotificationType{
    private String recipientEmail;
    private String senderEmail;
    private String subject;
    
    public EmailNotification(String recipientEmail, String senderEmail, String subject){
        this.recipientEmail = recipientEmail;
        this.senderEmail = senderEmail;
        this.subject = subject;
    }
    
    @Override
    public void send(String content) {
        System.out.println("Enviar mensaje a: " + recipientEmail);
        System.out.println("De: " + senderEmail);
        System.out.println("Tema: " + subject);
        System.out.println("Contenido: " + content);
    }
    
}
