package week_8.lesson2_C6;

import java.util.ArrayList;

public class Jugueteria {

    private ArrayList<CuponAplicable> productos;

    public void agregarProducto(CuponAplicable c) {
        if(this.productos == null){
            this.productos = new ArrayList<>();
        }
        this.productos.add(c);
    }
    public void generarReporte(){
        for(CuponAplicable c: this.productos){
            System.out.println("El producto " + c.getClass() + " tiene un precio de " + c.getPrecio());
        }
    }
}
