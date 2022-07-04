package week_8.finalExamPractice;

public class Test {
    public static void main(String[] args) {

        OfertaAcademicaFactory fabrica = OfertaAcademicaFactory.getInstance();

        OfertaAcademica backend = fabrica.crearOfertaAcademica("backend");
        OfertaAcademica fronend = fabrica.crearOfertaAcademica("frontend");
        OfertaAcademica fullstack = fabrica.crearOfertaAcademica("fullstack");

        System.out.println("curso: "+ backend.getNombre() + " costo: " + backend.calcularPrecio());
        System.out.println("curso: "+ fullstack.getNombre() + " costo: " + fullstack.calcularPrecio());
        System.out.println("curso: "+ fronend.getNombre() + " costo: " + fronend.calcularPrecio());

        Instituto inst = new Instituto();
        inst.agregarOfertas(backend);
        inst.agregarOfertas(fronend);
        inst.agregarOfertas(fullstack);
        inst.generarInforme();

    }
}
