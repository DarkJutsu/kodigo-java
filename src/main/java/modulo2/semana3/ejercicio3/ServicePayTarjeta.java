package modulo2.semana3.ejercicio3;

public class ServicePayTarjeta implements ServicePay{
    @Override
    public void pay(double pago) {
        System.out.println("Pago con Tarjeta: $"+ pago);
    }
}
