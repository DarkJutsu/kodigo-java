package modulo2.semana1.ejercicio1;

public class Mian {
    public static void main(String[] args) {
        GestionarEmpleadosReportes reportes=new GestionarEmpleadosReportes();

        reportes.addEmpleado(new Empleado("Juan", 234.99));
        reportes.addEmpleado(new Empleado("Carlos", 500.99));

        reportes.reportes();

//        APLICANDO PRINCIPIOS SOLID

        GestionEmpleado empleados1=new GestionEmpleado();
        empleados1.addEmpleado(new Empleado("Juan Perez", 355.30));
        empleados1.addEmpleado(new Empleado("Ricardo Rodriguez", 600.50));

        GenerarReportes generarRe=new GenerarReportes();
        generarRe.getReportes(empleados1.getEmpleados());
    }
}
