package week_7.lesson2_C1;

public class Amarillo implements StateSemaforo{

    private Semaforo semaforo;

    public Amarillo(Semaforo s) {
        this.semaforo = s;
    }

    public void mostrarAviso(){
        System.out.println("AMARILLO: Precaucion");

    }
    public void cambiarEstado(){
        semaforo.setEstado(new Rojo(semaforo));

    }
}
