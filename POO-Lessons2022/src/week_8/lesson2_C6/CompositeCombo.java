package week_8.lesson2_C6;

import java.util.ArrayList;

public class CompositeCombo implements CuponAplicable{

    private Integer codigo;
    private ArrayList<CuponAplicable> productos = new ArrayList<>();

    public CompositeCombo(Integer codigo) {
        this.codigo = codigo;
    }

    public void agregarProducto(CuponAplicable c){
        this.productos.add(c);
    }

    @Override
    public Double getPrecio() {
        Double precioTotal = 0.0;
        for(CuponAplicable c: this.productos){
            precioTotal += c.getPrecio();
        }
        return precioTotal*0.85;
    }


    @Override
    public Double aplicarDescuento(String s) {
        if(s.equals("cupon15")){
            return this.getPrecio()*0.85;
        } else {
            return this.getPrecio()*0.70;
        }
    }
}
