package modulo2.semana3.patronDecorador;

public class Leche extends IngredientesBebida{
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con leche";
    }

    @Override
    public double precio() {
        return super.precio() + .50;
    }
}
