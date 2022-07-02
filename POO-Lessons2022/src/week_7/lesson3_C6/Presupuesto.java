package week_7.lesson3_C6;

public class Presupuesto implements StateArticulo{

    private Articulo articulo;

    public Presupuesto(Articulo articulo) {
        this.articulo = articulo;
    }

    public void valorPresupuesto(){
    //el presuuesto inicial es por defecto
        articulo.setValorPresupuesto(1000.0);
    };
    public void sumarRepuesto(){
        //handle error
    };
    public void cambiarDireccion(String direccion){
        //handle error
    };
    public void pasarSiguientePaso(){
        articulo.setEstado(new Reparacion(articulo));

    };

}
