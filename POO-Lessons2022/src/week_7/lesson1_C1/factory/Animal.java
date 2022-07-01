package week_7.lesson1_C1.factory;

public abstract class Animal {
    private Double peso;
    private String nombre;

    public Animal(Double peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }
    public abstract void emitirSonido();
}
