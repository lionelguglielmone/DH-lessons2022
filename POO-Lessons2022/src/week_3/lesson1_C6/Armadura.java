package week_3.lesson1_C6;

public class Armadura {
    //atributos
    private String nombre;
    private String tipo;
    private boolean tieneCapa;

    //constructor

    public Armadura(String nombre) {
        this.nombre = nombre;
    }

    public void activarPoderEspecial(){
        System.out.println("Poder especial activado");
    }

    //metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneCapa() {
        return tieneCapa;
    }

    public void setTieneCapa(boolean tieneCapa) {
        this.tieneCapa = tieneCapa;
    }
}
