package modulo2.semana2.ejercicio1;

public class NotificationSMS implements Notification{
    @Override
    public void send(String msj) {
        System.out.println(msj + "\n--Envido desde SMS\n");
    }
}
