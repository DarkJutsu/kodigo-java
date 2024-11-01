package modulo2.semana2.ejercicio1;

public class ServiceNotification {
    public void notificationUser(Notification notification, String msj){
        notification.send(msj);
    }
}
