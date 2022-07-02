package week_7.lesson3_C6;

public class Finalizado implements StateArticulo{

    private Articulo articulo;

    public Finalizado(Articulo articulo) {
        this.articulo = articulo;
    }

    public void valorPresupuesto(){
        //handle error
    };
    public void sumarRepuesto(){
        //handle error

    };
    public void cambiarDireccion(String direccion){
        //handle error

    };
    public void pasarSiguientePaso(){
        System.out.println("El articulo fue entregado");
    };
}
