package week_8.lesson2_C6;

public class Juguete implements CuponAplicable{
    private String nombre;
    private Integer edadMin;
    private Double precio;

    public Juguete(String nombre, Integer edadMin, Double precio) {
        this.nombre = nombre;
        this.edadMin = edadMin;
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
