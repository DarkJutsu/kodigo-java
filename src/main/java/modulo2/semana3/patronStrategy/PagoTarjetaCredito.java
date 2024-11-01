package modulo2.semana3.patronStrategy;

public class PagoTarjetaCredito implements StrategyPago{
    @Override
    public void pagar(double pago) {
        System.out.println("Pago con Tarjeta de Credito: $" + pago);
    }
}
