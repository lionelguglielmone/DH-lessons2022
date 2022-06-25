package week_6.lesson3_C6;

public class Jugador {
    //atributos
    private String posicion;
    private String apellido;
    private Integer nroCamiseta;
    //constructor

    public Jugador(String posicion, String apellido, Integer nroCamiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
    }


    //metodos


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }
}
