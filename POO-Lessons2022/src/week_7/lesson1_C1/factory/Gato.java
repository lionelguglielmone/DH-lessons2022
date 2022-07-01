package week_7.lesson1_C1.factory;

public class Gato extends Animal{
    private boolean esAnaranjado;

    public Gato(Double peso, String nombre, boolean esAnaranjado) {
        super(peso, nombre);
        this.esAnaranjado = esAnaranjado;
    }
    @Override
    public void emitirSonido(){
        System.out.println("miauuuu!");
    }
}
