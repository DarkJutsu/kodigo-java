package modulo2.semana3.patronObserver;

public class Usuario implements Observer{
    private final String nombre;
    private final int edad;

    public Usuario(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public void update(String noticia) {
        System.out.println(nombre + " hay una nueva noticia, " + noticia);
    }

    @Override
    public void updateExplicit(String noticia) {
        if(edad>17){
            System.out.println(nombre + " hay una nueva noticia(+18), " + noticia);
        }
    }
}
