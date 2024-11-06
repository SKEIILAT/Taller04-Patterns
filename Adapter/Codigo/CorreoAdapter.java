public class CorreoAdapter implements Notificacion {
    private Correo correo;
    private Informe informe;

    public CorreoAdapter(Informe informe) {
        this.informe = informe;
        this.correo = new Correo();
    }

    @Override
    public void enviarNotificacion() {
        correo.enviarNotificacion();
    }
}
