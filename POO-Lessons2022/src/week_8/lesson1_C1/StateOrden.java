package week_8.lesson1_C1;

public interface StateOrden {

    void valorPresupuesto(Double precio);
    void sumarRepuesto (Double precioRepuesto);
    void cambiarDireccion(String direccion);
    void pasarSiguientePaso();
}
