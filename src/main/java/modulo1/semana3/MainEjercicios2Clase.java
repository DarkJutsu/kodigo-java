package modulo1.semana3;

import java.util.Scanner;

public class MainEjercicios2Clase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Ungrese un numero: ");
        String entrada=in.nextLine();

        try{
            int numero=Integer.parseInt(entrada);
            System.out.println(numero);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
