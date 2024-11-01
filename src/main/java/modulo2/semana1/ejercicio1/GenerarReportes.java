package modulo2.semana1.ejercicio1;

import java.util.List;

public class GenerarReportes {
    public void getReportes(List<Empleado> empleados){
        System.out.println("INFORMES DE EMPLEADOS");
        for(Empleado empl : empleados){
            System.out.println("Nombre: "+ empl.getNombre() +", Salario: $"+ empl.getSalario());
        }
    }
}
