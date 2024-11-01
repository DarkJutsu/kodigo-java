package modulo1.semana3;

import java.util.Scanner;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int exitE=0;

        menu();
        while (exitE!=1){
            print("---Nuevo Trabajador---");
            print("Nombre trabajador: ");
            String nom=in.nextLine();
            print("Horas trabajadas en la semana: ");
            int horas=in.nextInt();
            print("Pago por hora $: ");
            double pagoH=in.nextDouble();
            double totalH=horas*pagoH;

            getDatos(nom, horas, pagoH, totalH);

            print("¿Salir? si=1 no=0");
            exitE=in.nextInt();
        };
    }
    private static void menu(){
        print("Sueldo Semanal(Lunes - Sabado 48 horas totales)");
        print("Salir X");
    }
    private static void print(String str){
        System.out.println(str);
    }
    private static void getDatos(String nom, int horas, double pagoH, double totalH){
        print("***********************************");
        print("Trabajador: "+ nom);
        print("Horas trabajadas en la semana: "+ horas);
        print("Pago por hora $: "+ pagoH);
        if(totalH>=0 && totalH<=150) {
            print("Descuento aplicado 5%");
            totalH -= (totalH * 0.05);
        } else if(totalH < 300) {
            print("Descuento aplicado 7%");
            totalH -= (totalH * 0.07);
        } else if (totalH<450){
            print("Descuento aplicado 9%");
            totalH-=(totalH*0.09);
        }
        print("Pago total de la semana $: "+ totalH);
    }
}
