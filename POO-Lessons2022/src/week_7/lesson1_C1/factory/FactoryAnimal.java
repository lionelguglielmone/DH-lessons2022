package week_7.lesson1_C1.factory;

public class FactoryAnimal {

    public static Animal crearAnimal(String tipo){
        switch (tipo){
            case ("perro"):
                return new Perro(20.0,"nombre",false);
            case ("gato"):
                return new Gato(20.0,"nombre",false);
            default:
                return null;



        }
    }
}
