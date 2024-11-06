public class CorreoAdapter implements Notificacion {
    private Correo adaptee;

    public CorreoAdapter( Correo correo) {
        this.adaptee = correo;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion();
    }
}
