package week_7.lesson1_C6.singleton;

public class CajeroSupermercado {
    //atributos
    private String nombre;
    private Integer id;

    private Calculadora calculadora = Calculadora.getInstance();

    public CajeroSupermercado(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Double aplicarDescuento(Double porcentaje, Double monto){
        return this.calculadora.aplicarDescuentos(monto,porcentaje);

    }
    public Double aplicarRecargo(Double recargo, Double monto) {
        return this.calculadora.aplicarIncremento(monto, recargo);
    }
}
