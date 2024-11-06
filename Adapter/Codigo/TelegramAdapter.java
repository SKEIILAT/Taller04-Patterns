public class TelegramAdapter implements Notificacion {
    private Telegram telegram;
    private Informe informe;

    public TelegramAdapter(Informe informe) {
        this.informe = informe;
        this.telegram = new Telegram();
    }

    @Override
    public void enviarNotificacion() {
        telegram.enviarNotificacion();
    }
}
