package week_8.finalExamPractice;

import java.util.ArrayList;

public class Programa extends OfertaAcademica{
    //atributos
    private Double bonificacion;
    //OfertaAcademica solo recibe Curso
    private ArrayList<OfertaAcademica> cursos;

    public Programa(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        this.cursos = new ArrayList<>();
    }


    @Override
    public Double calcularPrecio(){
        Double valorTotal = 0.0;
        for(OfertaAcademica oa: this.cursos) {
            valorTotal += oa.calcularPrecio();
        }
        return valorTotal*(1-this.bonificacion);
    }
    public void agregarCurso(OfertaAcademica oa) {
        this.cursos.add(oa);
    }
}
