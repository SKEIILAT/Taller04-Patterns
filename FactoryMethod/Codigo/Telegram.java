package factorymethod;

/**
 *
 * @author USUARIO
 */
public class Telegram extends Notificacion {
    
    @Override
    public void enviarNotificacion(){
        System.out.println("Enviando notificacion a Telegram...");
    }
}
