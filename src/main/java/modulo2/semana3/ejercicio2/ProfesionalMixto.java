package modulo2.semana3.ejercicio2;

public class ProfesionalMixto implements PInstructor, PConsultor{
    @Override
    public void getConsultoria() {
        System.out.println("Haciendo consultoria...");
    }

    @Override
    public void setCurso() {
        System.out.println("Impartiendo curso...");
    }
}
