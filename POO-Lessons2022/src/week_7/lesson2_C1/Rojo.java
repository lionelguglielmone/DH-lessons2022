package week_7.lesson2_C1;

public class Rojo implements StateSemaforo{

    private Semaforo semaforo;

    public Rojo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public void mostrarAviso(){
        System.out.println("ROJO: Detengase");

    }
    public void cambiarEstado(){
        semaforo.setEstado(new Verde(semaforo));

    }


}
