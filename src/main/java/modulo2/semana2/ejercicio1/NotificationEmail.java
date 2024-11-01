package modulo2.semana2.ejercicio1;

public class NotificationEmail implements Notification {
    @Override
    public void send(String msj) {
        System.out.println(msj + "\n--Enviado desde Correo\n");
    }
}
