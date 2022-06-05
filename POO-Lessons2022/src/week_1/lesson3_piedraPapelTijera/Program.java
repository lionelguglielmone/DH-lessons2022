package week_1.lesson3_piedraPapelTijera;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Juego piedraPapelTijera = new Juego();
        //tomo nombre de los dos jugadores
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenides al juego PIEDRA, PAPEL O TIJERA");
        System.out.println("Ingrese el nombre del primer jugador");
        String nombreJugador1 = scanner.nextLine();
        System.out.println("Ingrese el nombre del segundo jugador");
        String nombreJugador2 = scanner.nextLine();
        //comienza el juego
        System.out.println("LET THE GAME BEGIN");

        boolean seguirJugando = true;
        Integer numeroRonda = 1;

        while (seguirJugando) {
            System.out.println("ronda " + numeroRonda);
            System.out.println("Jugador 1, ingrese su jugada, por favor: ");
            String jugadaJugador1 = scanner.nextLine();
            if (jugadaJugador1.equals("*")){
                break;
            }
            System.out.println("Jugador 2, ingrese su jugada, por favor: ");
            String jugadaJugador2 = scanner.nextLine();

            //definir ganador
            Integer resultado = piedraPapelTijera.cualGana(jugadaJugador1, jugadaJugador2);
            if (resultado == 0){
                System.out.println("Empate");
            } else if (resultado == 1){
                System.out.println("Gano el jugador 1");
            } else {
                System.out.println("Gano el jugador 2");

            }
            numeroRonda ++;
        }





    }

}
