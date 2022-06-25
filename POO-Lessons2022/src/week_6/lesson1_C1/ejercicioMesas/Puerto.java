package week_6.lesson1_C1.ejercicioMesas;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        //this.contenedores = new ArrayList<>();
    }

    public void addContenedor(Contenedor c) {
        if(this.contenedores == null){
            this.contenedores = new ArrayList<>();
        }
        this.contenedores.add(c);
    }

}
