package week_6.lesson1_C1;

import java.util.ArrayList;

public class Equipo {
    //atributos
    private String nombre;
    private ArrayList<Jugador> jugadores;
    //constructor
    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador j){
        this.jugadores.add(j);
    }

    public ArrayList getJugadores(){
        return this.jugadores;
    }

    //metodos

    public void mostrarJugadoresTitulares(){
        for(Jugador jugador: this.jugadores){
            if(jugador.isTitular()){
                System.out.println(jugador.getNombre());
            }
        }
    }

    public int getCantidadJugadoresLesionados(){
        int cantidad = 0;
        for(Jugador jugador: this.jugadores){
            if(jugador.isLesionado()){
            cantidad ++;
            }
        }
        return cantidad;
    }

}
