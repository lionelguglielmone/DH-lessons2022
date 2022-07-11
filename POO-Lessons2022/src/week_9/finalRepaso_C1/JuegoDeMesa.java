package week_9.finalRepaso_C1;

public class JuegoDeMesa implements Vendible{

    private String nombre;
    private Integer cantMinJug;
    private Integer cantMaxJug;
    private Double precio;

    public JuegoDeMesa(String nombre, Integer cantMinJug, Integer cantMaxJug, Double precio) {
        this.nombre = nombre;
        this.cantMinJug = cantMinJug;
        this.cantMaxJug = cantMaxJug;
        this.precio = precio;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Double aplicarDescuento(String cupon) {
        if(cupon.equals("cupon15")) {
            return this.precio*0.85;
        } else {
            return this.precio*0.70;
        }
    }

    @Override
    public String getNombre(){
        return this.nombre;
    }
}
