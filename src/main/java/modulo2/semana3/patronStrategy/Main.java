package modulo2.semana3.patronStrategy;

public class Main {
    public static void main(String[] args) {
        CarritoCompra carrito=new CarritoCompra();
        carrito.setStrategyPago(new PagoTarjetaCredito());
        carrito.processPago(260.77);

        carrito.setStrategyPago(new PagoPayPal());
        carrito.processPago(260.77);

        carrito.setStrategyPago(new PagoTranferenciaBanco());
        carrito.processPago(260.77);
    }
}
