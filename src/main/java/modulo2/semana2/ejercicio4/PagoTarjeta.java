package modulo2.semana2.ejercicio4;

public class PagoTarjeta extends MetodoPago{

    @Override
    public void pago(double pago) {
        System.out.println("Procesando pago $"+ pago +" por Tarjeta de Credito...");
    }
}
