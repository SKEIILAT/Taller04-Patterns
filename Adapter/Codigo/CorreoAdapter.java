public class CorreoAdapter implements Notificacion {
    private Correo adaptee;
    private Informe informe;

    public CorreoAdapter(Informe informe, Correo correo) {
        this.informe = informe;
        this.adaptee = correo;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion();
    }
}
