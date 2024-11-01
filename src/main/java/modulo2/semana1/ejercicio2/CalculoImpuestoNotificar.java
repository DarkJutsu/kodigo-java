package modulo2.semana1.ejercicio2;

public class CalculoImpuestoNotificar {
    private final double IVA;

    public CalculoImpuestoNotificar() {
        this.IVA = 0.13;
    }

    public void setImpuesto(Producto producto){
        producto.setPrecio(producto.getPrecio()+(producto.getPrecio()*this.IVA));
        notificar(producto);
    }

    public void notificar(Producto producto){
        System.out.printf("Se aplico el impuesto al producto. Impuesto aplicado %d porciento.\n", (int)(this.IVA*100));
        System.out.printf("Producto Actualizado: %s, %.2f.", producto.getNombre(), producto.getPrecio());
    }
}
