package modulo1.semana3;

import java.util.Scanner;

public class MainEjercicios5Clase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Ingrese la suma: ");
        int suma=in.nextInt();
        System.out.println("Ingrese el promedio: ");
        int prom=in.nextInt();

        try {
            System.out.println("Resultado: " + suma/prom);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


    }
}
