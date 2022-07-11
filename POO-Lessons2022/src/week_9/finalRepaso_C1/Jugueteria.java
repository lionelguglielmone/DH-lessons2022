package week_9.finalRepaso_C1;

import java.util.ArrayList;

public class Jugueteria {

    private ArrayList<Vendible> catalogoProductos;

    public Jugueteria(){
        this.catalogoProductos = new ArrayList<>();
    }

    public void agregarProducto(Vendible v) {
        this.catalogoProductos.add(v);
    }
    public void generarReporte(){
        for(Vendible v: this.catalogoProductos){
            System.out.println(v.getNombre() + ": precio regular: " + v.getPrecio() + " - precio15%: " + v.aplicarDescuento("cupon15") + " - precio30%: " + v.aplicarDescuento("cupon30"));
        }
    }
}
