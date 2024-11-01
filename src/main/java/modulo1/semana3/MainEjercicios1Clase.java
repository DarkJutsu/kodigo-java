package modulo1.semana3;

import java.util.Scanner;

public class MainEjercicios1Clase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Ingresa numero 1: ");
        int num1=in.nextInt();
        System.out.println("Ingresa numero 2: ");
        int num2=in.nextInt();

        try{
            int divis=num1/num2;
            System.out.println(divis);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
