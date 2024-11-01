package modulo2.semana1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class GestionarEmpleadosReportes {
    private final List<Empleado> empleados;

    public GestionarEmpleadosReportes() {
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empl){
        empleados.add(empl);
    }

    public void reportes(){
        System.out.println("INFORMES DE EMPLEADOS");
        for(Empleado empl : empleados){
            System.out.printf("Nombre: %s, Salario: $%f.\n", empl.getNombre(), empl.getSalario());
        }
    }
}
