package modulo2.semana3.ejercicio1;

public class NotificaionEmail extends Notification {
    @Override
    public void sendNotif(String msj){
        System.out.println("Notificacion Email: "+ msj);
    }
}
