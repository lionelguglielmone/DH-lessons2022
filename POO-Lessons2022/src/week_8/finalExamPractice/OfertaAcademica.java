package week_8.finalExamPractice;

public abstract class OfertaAcademica {

    //atributos
    private String nombre;
    private String descripcion;
    //constructor

    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}

