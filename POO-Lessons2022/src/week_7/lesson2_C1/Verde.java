package week_7.lesson2_C1;

public class Verde implements StateSemaforo{

    //atributos
    private Semaforo semaforo;

    public Verde(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    //metodos
    public void mostrarAviso(){
        System.out.println("VERDE: Avance");
    }
    public void cambiarEstado(){
        //
        semaforo.setEstado(new Amarillo(semaforo));
    }

    public StateSemaforo getSemaforo(){
        return this.semaforo.getEstado();
    }



}
