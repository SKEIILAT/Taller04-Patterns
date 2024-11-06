public class TelegramAdapter implements Notificacion {
    private Telegram adaptee;

    public TelegramAdapter(Telegram telegram) {
        this.adaptee = telegram;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion();
    }
}
