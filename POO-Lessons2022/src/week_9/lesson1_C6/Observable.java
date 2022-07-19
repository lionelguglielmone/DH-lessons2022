package week_9.lesson1_C6;

public interface Observable {

    void inform(String s);

    void agregarSeguidor(Observer o);

    void agregarFoto(String s);

    void quitarFoto(String s);
}