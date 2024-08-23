package modulo1.semana2;

import java.util.Scanner;

public class MainValidationPass {
    public static void main(String[] args) {
        int intentos=0;
        String passVeri ="LopezZ";
        String pass="";
        Scanner inputPass=new Scanner(System.in);

        while(!passVeri.equals(pass)){
            if(intentos<3){
                System.out.println("Ingrese la clave: ");
                pass=inputPass.nextLine();
            }else {
                System.out.println("Ya no tienes mas intentos");
                break;
            }

            if (!passVeri.equals(pass)){
                System.out.println("Clave incorrecta!!!");
            }else {
                System.out.println("La clave es correcta");
            }
            intentos++;
        }



    }
}
