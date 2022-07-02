package week_7.lesson3_C6;

public class Reparacion implements StateArticulo{

    private Articulo articulo;

    public Reparacion(Articulo articulo) {
        this.articulo = articulo;
    }

    public void valorPresupuesto(){
        //handle error
    };
    public void sumarRepuesto(){
        articulo.agregarValorRepuesto(222.3);
    };
    public void cambiarDireccion(String direccion){
        //handle error

    };
    public void pasarSiguientePaso(){
        articulo.setEstado(new ParaEnvio(articulo));

    };
}
