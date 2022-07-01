package week_7.lesson2_C6;

public class Verde implements StateSemaforo{

    private Semaforo semaforo;

    public Verde(Semaforo semaforo) {
        this.semaforo = semaforo;
    }
    @Override
    public void mostrarAviso() {
        System.out.println("VERDE: avanzar");

    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Amarillo(semaforo));
    }
}
