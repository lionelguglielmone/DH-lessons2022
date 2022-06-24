package week_6.lesson2_C6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

            try {
                Equipo losAguiluchos = new Equipo("Los Aguiluchos");

                Scanner scanner =  new Scanner(System.in);
                System.out.println("Ingrese numero camiseta");
                Integer numero = scanner.nextInt();
                System.out.println("Ingrese nombre jugador");
                String nombre = scanner.next();
                Jugador gonzalez = new Jugador(numero,nombre,false, true);
                System.out.println("se creo el objeto");

                losAguiluchos.addJugador(gonzalez);

                //Jugador mendez = new Jugador(3,"Lucio Mendez",false, true);
                //losAguiluchos.addJugador(mendez);


                ArrayList<Jugador> jugadores = losAguiluchos.getJugadores();

                for (Jugador j : jugadores){
                    System.out.println("nombre jugador: " + j.getNombre());
                }
            } catch(Exception exception){
                System.err.println("error en la ejecucion");
            }




        /*
        for( int i=0; i<jugadores.size(); i++){
            System.out.println("Nombre de jugador " + (i+1) + " : " + jugadores.get(i).toString());
        }*/

//            losAguiluchos.mostrarJugadoresTitulares();
        /*
        Jugador gonzalez = new Jugador(5,"Gonzalo Gonzales",false, true);
        Jugador mendez = new Jugador(3,"Lucio Mendez",false, true);

        gonzalez.compareTo(mendez);*/



    }

}
