package modulo2.semana3.patronObserver;

public class Main {
    public static void main(String[] args) {
        CanalNoticia canal=new CanalNoticia();

        Observer user1=new Usuario("Juan");
        Observer user2=new Usuario("Karen");

        canal.addObserver(user1);
        canal.addObserver(user2);

        canal.notificar("Suspencion de clases.");
        canal.notificar("Tormentas fuertes al norte del pais.");

    }
}
