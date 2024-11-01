package modulo2.semana1.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto cafe=new Producto("Café", 24.55);
        Producto azucar=new Producto("Azucar", 2.50);
        Producto leche=new Producto("Leche", 3.00);

        CalculoImpuestoNotificar calcularNotifi=new CalculoImpuestoNotificar();
        calcularNotifi.setImpuesto(cafe);

        //APLICANDO PRINCIPIOS SOLID
        System.out.println("\n\nAPLICANDO PRINCIPIOS SOLID");
        Impuesto impuesto=new Impuesto();
        impuesto.setImpuesto(azucar);

    }
}
