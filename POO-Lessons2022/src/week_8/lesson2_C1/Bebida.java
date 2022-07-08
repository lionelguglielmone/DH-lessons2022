package week_8.lesson2_C1;

public class Bebida implements Comprable{
    private String nombre;
    private Double precio;

    public Bebida(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }
}
