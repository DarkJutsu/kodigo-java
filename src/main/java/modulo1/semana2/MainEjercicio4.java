package modulo1.semana2;

import java.util.Scanner;

public class MainEjercicio4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int nMes=1;
        double mesTotal=0.0;

        print("------CONTROL DE AHORROS------");
        while(nMes<13){
            switch (nMes){
                case 1:
                    print("Ahorros de Enero: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 2:
                    print("Ahorros de Febrero: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 3:
                    print("Ahorros de Marzo: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 4:
                    print("Ahorros de Abril: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 5:
                    print("Ahorros de Mayo: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 6:
                    print("Ahorros de Junio: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 7:
                    print("Ahorros de Julio: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 8:
                    print("Ahorros de Agosto: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 9:
                    print("Ahorros de Septiembre: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 10:
                    print("Ahorros de Octubre: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 11:
                    print("Ahorros de Noviembre: ");
                    mesTotal+=in.nextDouble();
                    break;
                case 12:
                    print("Ahorros de Diciembre: ");
                    mesTotal+=in.nextDouble();
                    break;
            }
            print("Ahorro total del mes: $"+ mesTotal);
            nMes++;
        }
        print("Ahorro anual: $"+ mesTotal);
    }

    private static void print(String str){
        System.out.println(str);
    }
}
