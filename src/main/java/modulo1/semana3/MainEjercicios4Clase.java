package modulo1.semana3;

public class MainEjercicios4Clase {
    public static void main(String[] args) {
        int[] nNum={23, 54, 34, 0, 12, 88};
        for (int j : nNum) {
            try{
                System.out.println(100 + "/" + j + "=" + (100 / j));
            }catch (ArithmeticException e){
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
