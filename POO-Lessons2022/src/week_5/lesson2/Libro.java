package week_5.lesson2;

public abstract class Libro {

    //atributos
    private String titulo;
    private String codigo;
    private Double precioLista;
    private Double precioPromocion;
    //constructor

    public Libro(String titulo, String codigo, Double precioLista, Double precioPromocion) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.precioLista = precioLista;
        this.precioPromocion = precioPromocion;
    }

    //metodos
    public abstract Double vender();

    public Double getPrecioLista() {
        return precioLista;
    }
}
