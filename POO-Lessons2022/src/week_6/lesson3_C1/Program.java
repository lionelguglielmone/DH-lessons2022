package week_6.lesson3_C1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        try {
            Jugador jugador = new Jugador("Pepe",7,"DEFENSOR");
            Jugador jugador2 = new Jugador("Pepa",1,"ARQUERO");
            jugador.setNroCamiseta(20);
            Seleccion seleccion = new Seleccion("Persa");

            seleccion.addJugador(jugador2);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);
            seleccion.addJugador(jugador);

            ArrayList<Jugador> jugadores = seleccion.obtenerReservas();
            for(Jugador j : jugadores) {
                System.out.println("jugador: " + j.getNombreApellido());
            }

            Integer cantArqueros = seleccion.cantJugadores("ARQUERO");
            System.out.println("La cantidad de arqueros es: " + cantArqueros);

            Integer cantSaltarines = seleccion.cantJugadores("dasdsadsadsada");
            System.out.println("La cantidad de SALTARINES es: " + cantSaltarines);
        } catch (PosicionException e) {
            System.err.println("Error");
        } catch (CamisetaInvalidaException e){
            System.err.println("Error");
        }


    }
}
