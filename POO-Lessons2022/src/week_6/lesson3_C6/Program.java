package week_6.lesson3_C6;

public class Program {
    public static void main(String[] args) {

        try {
            Equipo seleccion = new Equipo("seleccion Persa");
            Jugador pepe = new Jugador("ARQUERO", "pepe", 7);
            Jugador pepa = new Jugador("ARQUERO", "pepa", 8);

            Jugador pepi = new Jugador("DEFENSOR", "pepi", 14);
            seleccion.addJugador(pepe);
            seleccion.addJugador(pepa);
            seleccion.addJugador(pepi);

            Integer cantidadArqueros = seleccion.cantJugadores("DASDSADSAD");
            System.out.println(cantidadArqueros);
        } catch(PosicionInexistenteException exception){
            System.err.println("error");
        }

    }
}
