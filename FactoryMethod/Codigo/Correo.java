package factorymethod;

/**
 *
 * @author USUARIO
 */
public class Correo extends Notificacion {

    @Override
    public void enviarNotificacion(){
        System.out.println("Enviando notificacion al correo electronico...");
    }
}
