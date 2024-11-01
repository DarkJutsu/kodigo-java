package modulo2.semana3.patronDecorador;

//PATRON DE DISEÑO DECORADOR

public class Main {
    public static void main(String[] args) {
        Bebida cafe=new Cafe();

        System.out.println(cafe.getDescription() + ", precio $" + cafe.precio());

        cafe=new Leche(cafe);
        System.out.println(cafe.getDescription() + ", precio $" + cafe.precio());

        cafe=new Azucar(cafe);
        System.out.println(cafe.getDescription() + ", precio $" + cafe.precio());
    }
}
