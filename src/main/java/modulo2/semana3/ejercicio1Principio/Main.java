package modulo2.semana3.ejercicio1Principio;

public class Main {
    public static void main(String[] args) {
        Notification email=new NotificationEmail();
        Notification sms=new NotificationSMS();

        email.sendNoti("Hola...");
        sms.sendNoti("Hola...");
    }
}
