package week_4.test_practiceC1C6;

public class Final extends Examen {
    //atributos
    private double notaOral;
    private String descripcion;
    //constructor

    public Final(String titulo, String enunciado, double nota, double notaOral, String descripcion) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

    //metodos
    @Override
    public boolean estaAprobado(){
        //opcion 1
        //boolean notaEscritoAprobada = getNota()>=4;
        //boolean oralYEscritoAprobadas = this.notaOral>=4 && notaEscritoAprobada;
        //return oralYEscritoAprobadas;
        //opcion 2
        return getNota()>=4 && this.notaOral>=4;
    }
}
