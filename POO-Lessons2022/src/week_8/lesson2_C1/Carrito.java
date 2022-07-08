package week_8.lesson2_C1;

import java.util.ArrayList;

public class Carrito {
    private String duenio;
    private ArrayList<Comprable> productos;

    public Carrito(String duenio){
        this.duenio = duenio;
        this.productos = new ArrayList<>();
    }

    public void agregarAlCarrito(Comprable c){
        this.productos.add(c);
    }
    public Double leerTotal(){
        Double total = 0.0;
        for (Comprable c: this.productos){
            total += c.getPrecio();
        }
        return total;
    }
    
    public String getDuenio() {
        return duenio;
    }
}
