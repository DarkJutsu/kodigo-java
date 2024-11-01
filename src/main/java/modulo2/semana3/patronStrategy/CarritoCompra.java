package modulo2.semana3.patronStrategy;

public class CarritoCompra {
    private StrategyPago strategyPago;

    public void setStrategyPago(StrategyPago strategyPago){
        this.strategyPago=strategyPago;
    }

    public void processPago(double monto){
        if(strategyPago==null){
            System.out.println("Seleccione un metodo de pago");
        }else{
            strategyPago.pagar(monto);
        }
    }
}
