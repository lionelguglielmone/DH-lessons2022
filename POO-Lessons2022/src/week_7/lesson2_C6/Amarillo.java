package week_7.lesson2_C6;

public class Amarillo implements StateSemaforo{
    private Semaforo semaforo;

    public Amarillo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("AMARILLO: precaucion");
    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Rojo(semaforo));

    }
}
