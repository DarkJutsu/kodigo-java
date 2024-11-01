package modulo2.semana1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpleado {
    private final List<Empleado> empleados;

    public GestionEmpleado() {
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empl){
        this.empleados.add(empl);
    }

    public List<Empleado> getEmpleados(){
        return this.empleados;
    }
}
