public class WhatsAppAdapter implements Notificacion {
    private WhatsApp whatsapp;
    private Informe informe;

    public WhatsAppAdapter(Informe informe) {
        this.informe = informe;
        this.whatsapp = new WhatsApp();
    }

    @Override
    public void enviarNotificacion() {
        whatsapp.enviarNotificacion();
    }
}
