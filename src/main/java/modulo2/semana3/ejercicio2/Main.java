package modulo2.semana3.ejercicio2;

public class Main {
    public static void main(String[] args) {
        PConsultor consultor=new Consultor();
        PInstructor instructor=new Instructor();
        ProfesionalMixto mixto=new ProfesionalMixto();

        consultor.getConsultoria();

        instructor.setCurso();

        mixto.getConsultoria();
        mixto.setCurso();

    }
}
