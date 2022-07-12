package week_9.lesson1_C1;

public class Program {

    public static void main(String[] args) {
        Observer juan = new Seguidor("Juan");
        Observer pedro = new Seguidor("Pedro");
        Observer maria = new Seguidor("Maria");

        Usuario juana = new Usuario("Juana");
        juana.agregarSeguidor(maria);
        juana.agregarSeguidor(juan);
        juana.agregarSeguidor(pedro);

        juana.addPic("EN LA PLAYA");

    }
}
