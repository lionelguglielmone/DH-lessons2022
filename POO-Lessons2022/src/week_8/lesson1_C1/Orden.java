package week_8.lesson1_C1;

import week_8.Presupuesto;

public class Orden {
    private StateOrden estado;
    private String direccion;

    public Orden(){
        this.estado = new Presupuesto(this);
    }

    public void setEstado(StateOrden estado){
        this.estado = estado;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }



}
