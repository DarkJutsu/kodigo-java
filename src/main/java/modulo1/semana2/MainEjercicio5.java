package modulo1.semana2;

public class MainEjercicio5 {
    public static void main(String[] args) {
        int nMes=1;
        int pago=0;
        while(nMes<21){
            print("Pago del mes "+ nMes +": $"+ (nMes*10));
            pago+=nMes*10;
            print("Saldo $"+ pago);
            nMes++;
        }
        print("Total a pagar despues de 20 meses $"+ pago);
    }

    private static void print(String str){
        System.out.println(str);
    }
}
