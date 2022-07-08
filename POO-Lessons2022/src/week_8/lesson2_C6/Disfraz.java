package week_8.lesson2_C6;

public class Disfraz implements CuponAplicable{

    private String descripcion;
    private String talle;
    private Double precio;

    public Disfraz(String descripcion, String talle, Double precio) {
        this.descripcion = descripcion;
        this.talle = talle;
        this.precio = precio;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Double aplicarDescuento(String s) {
        if(s.equals("cupon15")){
            return this.precio*0.85;
        } else {
            return this.precio*0.7;
        }
    }
}
