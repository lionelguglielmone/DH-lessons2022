package week_7.lesson1_C1.factory;

public class Perro extends Animal{
    private boolean sabeHacerTrucos;

    public Perro(Double peso, String nombre, boolean sabeHacerTrucos) {
        super(peso, nombre);
        this.sabeHacerTrucos = sabeHacerTrucos;
    }
    @Override
    public void emitirSonido(){
        System.out.println("guau, guau!");
    }
}
