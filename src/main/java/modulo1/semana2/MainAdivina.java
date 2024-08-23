package modulo1.semana2;

import java.util.Scanner;

public class MainAdivina {
    public static void main(String[] args) {
        int myRandom=(int)(Math.random()*100)+1;
        System.out.println(myRandom);
        int intentos=0;
        int num=0;

        Scanner input=new Scanner(System.in);
        while (num!=myRandom){
            intentos++;
            System.out.println("Ingrese un numero: ");
            num=input.nextInt();

            if(num>myRandom){
                System.out.println("Tu numero es mayor");
            }else if(num<myRandom){
                System.out.println("Tu numero es menor");
            }
        }
        System.out.println("Has encontrado tu numero " + num + " en " + intentos + " intentos");
    }
}
