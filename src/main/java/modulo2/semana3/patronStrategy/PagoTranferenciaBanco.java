package modulo2.semana3.patronStrategy;

public class PagoTranferenciaBanco implements StrategyPago{
    @Override
    public void pagar(double pago) {
        System.out.println("Pago con Transferencia Bancaria(Comision $0.50): $" + (pago+.50));
    }
}
