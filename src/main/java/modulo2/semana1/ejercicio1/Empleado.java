package modulo2.semana1.ejercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return new BigDecimal(this.salario).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
