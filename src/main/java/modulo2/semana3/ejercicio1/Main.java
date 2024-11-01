package modulo2.semana3.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Notification email=new NotificaionEmail();
        Notification sms=new NotificationSMS();

        email.sendNotif("Hola");
        sms.sendNotif("Hola sdfsdfsdf sdfsdfsdfsdf asdasdasdasd asdasdasd");
        sms.sendNotif("Hola");
    }
}
