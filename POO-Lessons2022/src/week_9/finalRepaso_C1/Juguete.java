package week_9.finalRepaso_C1;

public class Juguete implements Vendible{
    private String nombre;
    private Double precio;
    private Integer edadMin;

    public Juguete(String nombre, Double precio, Integer edadMin) {
        this.nombre = nombre;
        this.precio = precio;
        this.edadMin = edadMin;
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
        return this.nombre;
    }
}
