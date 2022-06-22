package week_6.lesson1_C6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        Equipo losAguiluchos = new Equipo("Los Aguiluchos");

        Jugador gonzalez = new Jugador(3,"Gonzalo Gonzales",false, true);
        losAguiluchos.addJugador(gonzalez);

        Jugador mendez = new Jugador(3,"Lucio Mendez",false, true);
        losAguiluchos.addJugador(mendez);


        ArrayList<Jugador> jugadores = losAguiluchos.getJugadores();
        /*
        for( int i=0; i<jugadores.size(); i++){
            System.out.println("Nombre de jugador " + (i+1) + " : " + jugadores.get(i).toString());
        }*/

        losAguiluchos.mostrarJugadoresTitulares();

    }

}
