package week_6.lesson1_C1;

public class Jugador implements Comparable<Jugador>{
    //atributos
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;
    //constructor

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    //metodos


    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public int compareTo(Jugador jugador){


        return 1;
    }

}
