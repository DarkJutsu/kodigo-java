package modulo2.semana2.ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("IMPLEMENTANDO EL PRINCIPIO SOLIC OCP\n");

        ServiceNotification service=new ServiceNotification();
        Notification email=new NotificationEmail();
        Notification sms=new NotificationSMS();

        service.notificationUser(email,"Hola a todos!!!");
        service.notificationUser(sms,"Hola a todos!!!");

    }
}
