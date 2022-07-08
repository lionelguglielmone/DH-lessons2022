package week_8.lesson2_C6;

public class JuegoDeMesa implements CuponAplicable{

    private String nombre;
    private Integer cantJugMin;
    private Integer cantJugMax;
    private Double precio;


    public JuegoDeMesa(String nombre, Integer cantJugMin, Integer cantJugMax, Double precio) {
        this.nombre = nombre;
        this.cantJugMin = cantJugMin;
        this.cantJugMax = cantJugMax;
        this.precio = precio;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Double aplicarDescuento(String s) {
        if(s.equals("cupon15")){
            return this.precio*0.85;
        } else if (s.equals("cupon30")){
            return this.precio*0.7;
        } else {
            System.out.println("El cupon no es valido");
            return this.precio;
        }
    }
}
