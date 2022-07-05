package week_8.lesson1_C1;

public class Reparacion implements StateOrden{
    private Orden orden;

    public Reparacion(Orden orden) {
        this.orden = orden;
    }

    @Override
    public void valorPresupuesto(Double precio){
        //handle error

    }
    @Override
    public void sumarRepuesto (Double precioRepuesto){
        //logica
    }
    @Override
    public void cambiarDireccion(String direccion) {
        //handle error

    }
    @Override
    public void pasarSiguientePaso(){
        orden.setEstado(new ParaEnvio(orden));
    }
}
