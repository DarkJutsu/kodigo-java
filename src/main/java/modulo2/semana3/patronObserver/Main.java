package modulo2.semana3.patronObserver;

public class Main {
    public static void main(String[] args) {
        CanalNoticia canal=new CanalNoticia();

        Observer user1=new Usuario("Juan", 18);
        Observer user2=new Usuario("Karen", 13);
        Observer user3=new Usuario("Jose", 29);

        canal.addObserver(user1);
        canal.addObserver(user2);
        canal.addObserver(user3);

        canal.notificar("Suspencion de clases.");
        canal.notificar("Tormentas fuertes al norte del pais.");
        canal.notificarExplicit("Masacre de personas en Suiza.");

    }
}
