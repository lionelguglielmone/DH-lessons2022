package week_8.finalExamPractice;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<OfertaAcademica> cursosYProgramas;

    public void agregarOfertas(OfertaAcademica oa) {
        if (this.cursosYProgramas == null) {
            this.cursosYProgramas = new ArrayList<>();
        }
        this.cursosYProgramas.add(oa);
    }

    public void generarInforme(){
        for(OfertaAcademica oa: this.cursosYProgramas){
            System.out.println("nombre" + oa.getNombre());
        }
    }
}
