package factorymethod;

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
