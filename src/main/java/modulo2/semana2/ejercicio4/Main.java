package modulo2.semana2.ejercicio4;

public class Main {
    public static void main(String[] args) {
        ServicePago pago=new ServicePago();

        MetodoPago paypal=new PagoPaypal();
        MetodoPago tarjeta=new PagoTarjeta();

        pago.procesarPago(paypal, 300);
        pago.procesarPago(tarjeta, 590.99);
    }
}
