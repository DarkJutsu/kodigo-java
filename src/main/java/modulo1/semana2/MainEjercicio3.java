package modulo1.semana2;

import java.util.Scanner;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        menu();
        print("Seleccione un tipo de HAmburguesa");
        int select=in.nextInt();
        print("Cuantas Hamburguesas llevara: ");
        int nHam=in.nextInt();

        switch (select){
            case 1:
                print(nHam +" Hamburguesas de $20.00. Total "+ (nHam*20));
                break;
            case 2:
                print(nHam +" Hamburguesas de $25.00. Total "+ (nHam*25));
                break;
            case 3:
                print(nHam +" Hamburguesas de $28.00. Total "+ (nHam*28));
                break;
        }
    }

    private static void menu(){
        System.out.println("---------MENU---------");
        System.out.println("1-Hamburguesa de $20.00");
        System.out.println("2-Hamburguesa de $25.00");
        System.out.println("3-Hamburguesa de $28.00");
    }
    private static void print(String str){
        System.out.println(str);
    }
}
