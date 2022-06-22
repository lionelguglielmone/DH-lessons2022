package week_6.lesson1_C6;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    //constructor


    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Jugador>();
    }

    //metodos
    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }


    public ArrayList getJugadores() {
        return this.jugadores;
    }

    public void setJugador(Jugador jugador){
        //guardar el jugador en la lista "jugadores"
    }

    public void mostrarJugadoresTitulares(){
        for (int i=0; i<this.jugadores.size(); i++){
            System.out.println("Esta lesionado: " + jugadores.get(i).isTitular());
        }
    }

    public int getCantidadJugadoresLesionados(){
        return 1;
    }

}
