package week_6.lesson3_C1;

public class Jugador {
    //atributos
    private String nombreApellido;
    private Integer nroCamiseta;
    private String posicion;
    //constructor

    public Jugador(String nombreApellido, Integer nroCamiseta, String posicion) {
        this.nombreApellido = nombreApellido;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }

    //metodos

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) throws CamisetaInvalidaException {
        if(nroCamiseta>99 && nroCamiseta<1){
            throw new CamisetaInvalidaException();
        }
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
