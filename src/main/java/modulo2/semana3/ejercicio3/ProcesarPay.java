package modulo2.semana3.ejercicio3;

public class ProcesarPay {
    private final ServicePay serviPay;

    public ProcesarPay(ServicePay serviPay){
        this.serviPay=serviPay;
    }

    public void procesarPay(double pago){
        serviPay.pay(pago);
    }
}
