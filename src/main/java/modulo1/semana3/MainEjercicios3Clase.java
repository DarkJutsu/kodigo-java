package modulo1.semana3;

public class MainEjercicios3Clase {
    public static void main(String[] args) {
        int[] myArray={100, 200, 300, 400, 5000};

        try{
            int elemento=myArray[3];
            System.out.println("El elemento es: " + elemento);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
