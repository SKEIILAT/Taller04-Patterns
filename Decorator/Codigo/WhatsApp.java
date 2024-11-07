/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USUARIO
 */
public class WhatsApp extends Notificacion{
    
    @Override
    public void enviarNotificacion(){
        System.out.println("Enviando notificacion a WhatsApp...");
    }
}
