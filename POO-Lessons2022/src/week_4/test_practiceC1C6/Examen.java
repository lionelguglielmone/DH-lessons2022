package week_4.test_practiceC1C6;

import javax.crypto.ExemptionMechanism;

public abstract class Examen {

    //atributos
    private String titulo;
    private String enunciado;
    private double nota;

    //constructor
    public Examen (String titulo,String enunciado, double nota){
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //metodos
    public abstract boolean estaAprobado();

}
