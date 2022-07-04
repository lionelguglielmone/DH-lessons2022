package week_8.finalExamPractice;

import week_5.lesson1_C6.Program;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instancia;

    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance(){
        if(instancia == null){
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }





    public OfertaAcademica crearOfertaAcademica(String ofertaAcademica){
        switch (ofertaAcademica) {
            case "backend":
                Curso backend2 = new Curso("backend","",20.0,2, 900.0);
                return backend2;
            case "frontend":
                return new Curso("frontend","",16.0,2,1000.0);
            case "fullstack":
                Curso backend = new Curso("backend","",20.0,2, 900.0);
                Curso frontend = new Curso("frontend","",16.0,2,1000.0);
                Programa fullstack = new Programa("fullstack","",0.2);
                fullstack.agregarCurso(backend);
                fullstack.agregarCurso(frontend);
                return fullstack;
            default:
                return null;
        }

    }


}
