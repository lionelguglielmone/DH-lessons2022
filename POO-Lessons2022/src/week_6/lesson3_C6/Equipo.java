package week_6.lesson3_C6;

import java.util.ArrayList;

public class Equipo {
    //atributos
    private String nombre;
    private ArrayList<Jugador> plantel; //0 a 10: titulares; 11 a 17: suplentes; 18 a 22: reserva
    //constructor

    public Equipo(String nombre) {
        this.nombre = nombre;
        //this.plantel = new ArrayList<>();
    }

    public ArrayList<Jugador> obtenerReservas(){


        ArrayList<Jugador> jugadoresEnReservas = new ArrayList<>();
        for(int i=18; i<this.plantel.size();i++){
            //Jugador jugadorDeReservaActual = this.plantel.get(i);
            //jugadoresEnReservas.add(jugadorDeReservaActual);
            jugadoresEnReservas.add(this.plantel.get(i));

        }
        return jugadoresEnReservas;
    }

    public Integer cantJugadores(String posicion) throws PosicionInexistenteException{
        if(posicion != "ARQUERO" || posicion != "DEFENSOR" || posicion != "MEDIOCAMPISTA" || posicion != "DELANTERO"){
            throw new PosicionInexistenteException("la posicion no existe");
        }
        Integer cantidadJugadoresEnPosicion = 0;
        for (Jugador jugador: this.plantel){
            if (jugador.getPosicion().equals(posicion)){
                cantidadJugadoresEnPosicion ++;
            }
        }
        return cantidadJugadoresEnPosicion;
    }

    public void addJugador(Jugador jugador){
        if(plantel == null){
            this.plantel = new ArrayList<>();
        }
        this.plantel.add(jugador);
    }


    //metodos
}
