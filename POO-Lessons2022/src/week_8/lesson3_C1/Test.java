package week_8.lesson3_C1;

public class Test {
    public static void main(String[] args) {
        FactoryOfertaAcademica factory = FactoryOfertaAcademica.getInstance();
        OfertaAcademicaDisponible backend = factory.crearOfertaAcademica("backend");
        OfertaAcademicaDisponible frontend = factory.crearOfertaAcademica("frontend");
        OfertaAcademicaDisponible fullstack = factory.crearOfertaAcademica("fullstack");

        Instituto DH = new Instituto();

        DH.agregarCursos(backend);
        DH.agregarCursos(frontend);
        DH.agregarCursos(fullstack);

        DH.generarInforme();
    }
}
