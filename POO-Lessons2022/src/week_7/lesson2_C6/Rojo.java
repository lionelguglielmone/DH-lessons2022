package week_7.lesson2_C6;

public class Rojo implements StateSemaforo{
    private Semaforo semaforo;

    public Rojo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("ROJO: no avanzar");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Verde(semaforo));

    }
}
