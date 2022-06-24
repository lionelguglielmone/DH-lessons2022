package week_6.lesson2_C6;

public class Jugador implements Comparable<Jugador>{
    //atributos
    private int numeroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    //constructor

    public Jugador(int numeroCamiseta, String nombre, boolean lesionado, boolean titular) throws Exception{

        if (numeroCamiseta<1 || numeroCamiseta>=100) {
            throw new CamisetaInvalidaException("la camiseta no puede ser 0 ni ser negativa, ni mayor a 100");
        }

        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }
    //metodos


    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
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
    @Override
    public String toString(){
        return ("nombre: " + this.nombre + "numero: " + this.numeroCamiseta);
    }

    @Override
    public int compareTo(Jugador jugador){


        if(this.numeroCamiseta == jugador.getNumeroCamiseta()){
            return 0;
        }
        if(this.numeroCamiseta> jugador.getNumeroCamiseta()){
            return 1;
        } else {
            return 2;
        }
    }
}
