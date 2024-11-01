package modulo2.semana3.patronObserver;

public class Usuario implements Observer{
    private final String nombre;

    public Usuario(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void update(String noticia) {
        System.out.println(nombre + " hay una nueva noticia, " + noticia);
    }
}
