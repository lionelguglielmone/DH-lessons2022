package week_7.lesson1_C1.factory;

public class Program {
    public static void main(String[] args) {
        Animal bobi = FactoryAnimal.crearAnimal("perro");
        bobi.emitirSonido();
    }
}
