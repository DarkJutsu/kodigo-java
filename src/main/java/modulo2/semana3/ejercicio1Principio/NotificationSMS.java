package modulo2.semana3.ejercicio1Principio;

public class NotificationSMS extends Notification{
    @Override
    public void sendNoti(String msj) {
        if(msj.length()>15) System.out.println("Mensaje SMS es muy extenso.");
        else System.out.println("Notificacion SMS: "+ msj);
    }
}
