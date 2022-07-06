package week_8.lesson1_C6;

public class Sandwich implements Comprable{
    private String tipo;
    private Double precio;

    public Sandwich(String tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public Double getPrecio(){
        return this.precio;
    }
}
