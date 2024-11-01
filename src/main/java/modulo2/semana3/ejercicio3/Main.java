package modulo2.semana3.ejercicio3;

public class Main {
    public static void main(String[] args) {
        ServicePay payTarjeta=new ServicePayTarjeta();
        ServicePay payPaypal=new ServicePayPayPal();
        ServicePay payBitcoin=new ServicePayBitCoin();

        ProcesarPay proceTarjeta=new ProcesarPay(payTarjeta);
        ProcesarPay procePaypal=new ProcesarPay(payPaypal);
        ProcesarPay proceBitCoin=new ProcesarPay(payBitcoin);

        proceTarjeta.procesarPay(200);
        procePaypal.procesarPay(500);
        proceBitCoin.procesarPay(1788);
    }
}
