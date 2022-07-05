package week_8;

import week_8.lesson1_C1.Orden;
import week_8.lesson1_C1.Reparacion;
import week_8.lesson1_C1.StateOrden;

public class Presupuesto implements StateOrden {

    private Orden orden;

    public Presupuesto(Orden orden) {
        this.orden = orden;
    }
    @Override
    public void valorPresupuesto(Double precio){
        //logica
    }
    @Override
    public void sumarRepuesto (Double precioRepuesto){
        //handle error
    }
    @Override
    public void cambiarDireccion(String direccion) {
        //handle error

    }
    @Override
    public void pasarSiguientePaso(){
        orden.setEstado(new Reparacion(orden));

    }

}
