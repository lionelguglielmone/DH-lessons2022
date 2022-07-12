package week_9.lesson1_C1;

import java.util.ArrayList;

public class Usuario implements Observable{


    private ArrayList<Observer> seguidores;
    private ArrayList<String> fotos;

    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.seguidores = new ArrayList<>();
        this.fotos = new ArrayList<>();
    }

    @Override
    public void notifyChange() {

    }
    public void agregarSeguidor(Observer o){
        this.seguidores.add(o);
    }

    public void addPic(String foto){
        this.fotos.add(foto);
        for(Observer seguidor: this.seguidores){
            seguidor.update();
            System.out.println(seguidor.getNombre() + " fue notificado de la foto " + foto + " que subio " + this.nombre);
        }

    }
}
