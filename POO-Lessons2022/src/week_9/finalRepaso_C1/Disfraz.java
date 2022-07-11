package week_9.finalRepaso_C1;

public class Disfraz implements Vendible{
    private String descripcion;
    private Double precio;
    private String talle;

    public Disfraz(String descripcion, Double precio, String talle) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.talle = talle;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Double aplicarDescuento(String cupon) {
        if(cupon.equals("cupon15")) {
            return this.precio*0.85;
        } else {
            return this.precio*0.70;
        }
    }
    @Override
    public String getNombre(){
        return this.descripcion;
    }
}
