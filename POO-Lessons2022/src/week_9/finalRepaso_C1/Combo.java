package week_9.finalRepaso_C1;

import java.util.ArrayList;

public class Combo implements Vendible{
    private String codigo;
    private Double porcentajeDesc;
    private ArrayList<Vendible> vendibles;

    public Combo(String codigo, Double porcentajeDesc) {
        this.codigo = codigo;
        this.porcentajeDesc = porcentajeDesc;
        this.vendibles = new ArrayList<>();
    }

    public void agregarVendible(Vendible v){
        this.vendibles.add(v);
    }
    @Override
    public Double getPrecio() {
        Double precioTotal = 0.0;
        for(Vendible v: this.vendibles){
            precioTotal += v.getPrecio();
        }

        return precioTotal*(1-this.porcentajeDesc);
    }

    @Override
    public Double aplicarDescuento(String cupon) {
        if(cupon.equals("cupon15")) {
            return this.getPrecio()*0.85;
        } else {
            return this.getPrecio()*0.70;
        }
    }
    @Override
    public String getNombre(){
        return this.codigo;
    }
}
