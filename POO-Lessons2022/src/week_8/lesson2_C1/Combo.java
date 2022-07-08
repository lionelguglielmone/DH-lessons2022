package week_8.lesson2_C1;

import java.util.ArrayList;

public class Combo implements Comprable{

    private String nombre;
    private ArrayList<Comprable> comprables;

    public Combo(String nombre, ArrayList<Comprable> comprables) {
        this.nombre = nombre;
        this.comprables = comprables;
    }

    @Override
    public Double getPrecio(){
        Double precioFinal = 0.0;
        for(Comprable c: this.comprables){
            precioFinal += c.getPrecio();
        }
        return precioFinal;

    }
}
