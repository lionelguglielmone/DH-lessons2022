package week_9.lesson1_C6;

public class Seguidor implements Observer{
    private String nombre;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void updateState(String s){
        System.out.println("Soy el/la usuario/a " + this.nombre + " estoy siendo notificado de que " + s);
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }
}
