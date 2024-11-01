package modulo2.semana1.ejercicio2;

public class Impuesto {
    private final double IVA;
    private final Notificacion noti;

    public Impuesto() {
        this.IVA = 0.13;
        this.noti=new Notificacion();
    }

    public void setImpuesto(Producto producto){
        producto.setPrecio(producto.getPrecio()+(producto.getPrecio()*this.IVA));
        this.noti.notificar(producto, this.IVA);
    }
}
