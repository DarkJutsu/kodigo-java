package modulo2.semana3.patronDecorador;

public abstract class IngredientesBebida implements Bebida {
    protected Bebida bebida;

    public IngredientesBebida(Bebida bebida){
        this.bebida=bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription();
    }

    @Override
    public double precio() {
        return bebida.precio();
    }
}
