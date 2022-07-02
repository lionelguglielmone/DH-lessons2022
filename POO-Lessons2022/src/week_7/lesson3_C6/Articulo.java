package week_7.lesson3_C6;

public class Articulo {
    private StateArticulo estado;
    private String nombre;
    private Double valorPresupuesto;
    private String direccion;


    public Articulo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        //setEstado(new Presupuesto(this));
        this.estado = new Presupuesto(this);
    }

    public void setEstado(StateArticulo estado) {
        this.estado = estado;
    }

    public void agregarValorRepuesto(Double valorRepuesto) {
        this.valorPresupuesto += valorRepuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorPresupuesto() {
        return valorPresupuesto;
    }

    public void setValorPresupuesto(Double valorPresupuesto) {
        this.valorPresupuesto = valorPresupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
