public class WhatsAppAdapter implements Notificacion {
    private WhatsApp adaptee;

    public WhatsAppAdapter(WhatsApp whatsApp) {
        this.adaptee = whatsApp;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion();
    }
}
