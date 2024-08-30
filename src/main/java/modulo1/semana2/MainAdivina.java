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
            System.out.println("(Intento: "+ intentos +") Ingrese un numero: ");
            num=input.nextInt();

            if(intentos<5){
                if(num>myRandom){
                    System.out.println("Tu numero es mayor. La diferencia es: "+ Math.abs((myRandom-num)));
                }else if(num<myRandom){
                    System.out.println("Tu numero es menor. La diferencia es: "+ (myRandom-num));
                }
            }else{
                if (num!=myRandom) {
                    System.out.println("Ya no tienes mas intentos.");
                    break;
                }
            }
        }
        if (num==myRandom)System.out.println("Has encontrado tu numero " + num + " en " + intentos + " intentos");
    }
}
