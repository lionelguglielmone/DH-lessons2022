package week_7.lesson3_C6;

public class ParaEnvio implements StateArticulo {

    private Articulo articulo;

    public ParaEnvio(Articulo articulo){
        this.articulo = articulo;
    }

    public void valorPresupuesto(){
        //handle error

    };
    public void sumarRepuesto(){
        //handle error

    };
    public void cambiarDireccion(String direccion){
        articulo.setDireccion(direccion);
    };
    public void pasarSiguientePaso(){
        articulo.setEstado(new Finalizado(articulo));

    };
}
