package modulo2.semana3.ejercicio1Principio;

public class NotificationEmail extends Notification{
    @Override
    public void sendNoti(String msj) {
        System.out.println("Notificacion Email: "+ msj);
    }
}
