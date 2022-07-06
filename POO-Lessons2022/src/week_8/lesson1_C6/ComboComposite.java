package week_8.lesson1_C6;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class ComboComposite implements Comprable{

    private ArrayList<Comprable> productos;
    private String nombre;

    public ComboComposite(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    public Double getPrecio(){
        Double valorTotal = 0.0;
        for(Comprable c: this.productos){
            valorTotal += c.getPrecio();
        }
        //con descuento del 10%
        return valorTotal*0.9;
    }

    public void addProducto(Comprable c){
        this.productos.add(c);
    }

}
