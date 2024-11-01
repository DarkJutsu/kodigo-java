package modulo2.semana1.ejercicio2;

public class Notificacion {
    public void notificar(Producto producto, double IVA){
        System.out.printf("Se aplico el impuesto al producto. Impuesto aplicado %d porciento.\n", (int)(IVA*100));
        System.out.printf("Producto Actualizado: %s, %.2f.", producto.getNombre(), producto.getPrecio());
    }
}
