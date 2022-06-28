package week_6.lesson3_C1;

import java.util.ArrayList;

public class Seleccion {
    //atributos
    private String nombre;
    private ArrayList<Jugador> plantel;
    //constructor
    public Seleccion(String nombre) {
        this.nombre = nombre;
        this.plantel = new ArrayList<>();
    }



    //metodos
    public void addJugador(Jugador jugador){
        this.plantel.add(jugador);
    }
    //los primeros 11 son los titulares, los siguientes 7 son los suplentes
    // y los 5 restantes son de reserva.
    public ArrayList<Jugador> obtenerReservas(){
        ArrayList<Jugador> reservas = new ArrayList<>();
        for(int i=18; i<this.plantel.size(); i++){
            reservas.add(this.plantel.get(i));
        }
        return reservas;
    }

    public Integer cantJugadores(String posicion) throws PosicionException{
        if(!posicion.equals("DEFENSOR") || !posicion.equals("ARQUERO")){
            throw new PosicionException();
        }
        Integer cantJug = 0;
        for(Jugador j: this.plantel) {
            if (j.getPosicion().equals(posicion)) {
                cantJug++;
            }
        }
        return cantJug;
    }

}
