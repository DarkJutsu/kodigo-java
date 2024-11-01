package modulo2.semana3.patronStrategy;

public class PagoPayPal implements StrategyPago{
    @Override
    public void pagar(double pago) {
        System.out.println("Pago con PayPal: $" + pago);
    }
}
