package week_3;

public class CupcakeC6 {
    //atributos
    private String sabor;
    private double precio;
    private String nombre;
    private boolean relleno;
    private String topping;

    //constructor
    public CupcakeC6(String sabor, String nombre, boolean relleno, String topping){
        this.sabor = sabor;
        this.nombre = nombre;
        this.relleno = relleno;
        this.topping = topping;
    }

    //metodos


    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
