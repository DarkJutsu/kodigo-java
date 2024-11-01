package modulo2.semana2.ejercicio4;

public class PagoPaypal extends MetodoPago{
    @Override
    public void pago(double pago) {
        System.out.println("Procesando pago $"+ pago +" por Paypal...");
    }
}
