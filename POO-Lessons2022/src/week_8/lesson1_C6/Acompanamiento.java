package week_8.lesson1_C6;

public class Acompanamiento implements Comprable{
    private String tipo;
    private Double precio;
    private String tamanio;

    public Acompanamiento(String tipo, Double precio, String tamanio) {
        this.tipo = tipo;
        this.precio = precio;
        this.tamanio = tamanio;
    }

    @Override
    public Double getPrecio(){
        return this.precio;
    }
}
