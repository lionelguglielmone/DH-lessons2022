package week_6.lesson1_C1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Jugador gomez = new Jugador(8,"Alfredo Gomez",false, true);
        Jugador lopez = new Jugador(3, "Gonzalo Lopez",false, false);

        Equipo losHalcones = new Equipo("Los Halcones");

        losHalcones.addJugador(gomez);
        losHalcones.addJugador(lopez);

        ArrayList<Jugador> listaDeJugadoresActuales = losHalcones.getJugadores();
        /*
        for(int i=0; i<listaDeJugadoresActuales.size(); i++){
            System.out.println("Jugador: " + listaDeJugadoresActuales.get(i).getNombre());
        }

        for(Jugador jugador : listaDeJugadoresActuales){
            System.out.println("Jugador: " + jugador.getNombre());
        }*/

        losHalcones.mostrarJugadoresTitulares();
        System.out.println("lesionados: " + losHalcones.getCantidadJugadoresLesionados());

    }
}
