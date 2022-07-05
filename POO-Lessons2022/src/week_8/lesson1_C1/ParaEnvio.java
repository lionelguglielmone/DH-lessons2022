package week_8.lesson1_C1;

public class ParaEnvio implements StateOrden{
    private Orden orden;

    public ParaEnvio(Orden orden) {
        this.orden = orden;
    }
    @Override
    public void valorPresupuesto(Double precio){
        //handle error

    }
    @Override
    public void sumarRepuesto (Double precioRepuesto){
        //handle error

    }
    @Override
    public void cambiarDireccion(String direccion) {
        orden.setDireccion(direccion);
    }
    @Override
    public void pasarSiguientePaso(){
        orden.setEstado(new Finalizado(orden));
    }
}
