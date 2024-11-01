package modulo2.semana3.ejercicio3;

public class ServicePayBitCoin implements ServicePay{
    @Override
    public void pay(double pago) {
        System.out.println("Pago con BitCoin: $"+ pago);
    }
}
