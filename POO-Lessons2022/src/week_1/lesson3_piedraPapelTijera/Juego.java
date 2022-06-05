package week_1.lesson3_piedraPapelTijera;

public class Juego {

    public Integer cualGana(String jugadaJugador1, String jugadaJugador2){
        if(jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera")){
            return 1;
        }
        if(jugadaJugador1.equals("papel") && jugadaJugador2.equals("tijera")){
            return 2;
        }
        return 0;
    }

}
