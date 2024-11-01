package modulo2.semana3.patronDecorador;

public class Azucar extends IngredientesBebida{
    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " con azucar";
    }

    @Override
    public double precio() {
        return super.precio() + 0.15;
    }
}
