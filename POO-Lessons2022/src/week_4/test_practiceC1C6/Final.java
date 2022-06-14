package week_4.test_practiceC1C6;

public class Final extends Examen implements Comparable{
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

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Object object) {
        Final unFinal = (Final) object;
        //si la nota escrita y la nota oral son iguales, entonces devuelvo 1
        //si la nota escrita y la nota oral son distintas, entonces devuelvo -1
        if ((getNota()== unFinal.getNota()) && (this.notaOral==unFinal.getNotaOral()) ){
            return 1;
        }
        return -1;

    }
}
