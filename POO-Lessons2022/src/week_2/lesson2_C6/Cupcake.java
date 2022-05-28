package week_2.lesson2_C6;

public class Cupcake {
    //atributos
    private String sabor;
    private static double precio;
    private String nombre;
    private boolean relleno;
    private String topping;

    //constructor
    public Cupcake(String sabor, String nombre, boolean relleno, String topping){
        this.sabor = sabor;
        this.nombre = nombre;
        this.relleno = relleno;
        this.topping = topping;
    }
    public Cupcake(String sabor){
        this.sabor = sabor;
    }

    //metodos

    public static void setPrecio(double precio){
        Cupcake.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

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
