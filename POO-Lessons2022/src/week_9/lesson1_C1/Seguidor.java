package week_9.lesson1_C1;

public class Seguidor implements Observer{

    private String nombre;
    private Integer cantidadNotificaciones = 0;

    public Seguidor(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void update() {
        this.cantidadNotificaciones ++;

    }

    @Override
    public String getNombre() {
        return nombre;
    }


}
