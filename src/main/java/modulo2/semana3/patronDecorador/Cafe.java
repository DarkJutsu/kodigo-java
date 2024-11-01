package modulo2.semana3.patronDecorador;

public class Cafe implements Bebida{
    @Override
    public double precio() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Cafe";
    }
}
