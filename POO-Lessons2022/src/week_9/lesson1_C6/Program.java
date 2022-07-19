package week_9.lesson1_C6;

public class Program {

    public static void main(String[] args) {
        Observer juan = new Seguidor("Juan");
        Observer paula = new Seguidor("Paula");
        Observer domenica = new Seguidor("Domenica");

        Observable britnerSpears = new Usuario("Britney Spears");

        britnerSpears.agregarSeguidor(juan);
        britnerSpears.agregarSeguidor(paula);
        britnerSpears.agregarSeguidor(domenica);

        britnerSpears.agregarFoto("dsadasdsadsadsda");


    }
}
