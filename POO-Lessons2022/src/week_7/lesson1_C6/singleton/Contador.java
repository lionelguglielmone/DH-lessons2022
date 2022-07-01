package week_7.lesson1_C6.singleton;

public class Contador {
    private String nombre;
    private String universidad;
    private Calculadora calculadora = Calculadora.getInstance();

    public Contador(String nombre, String universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public Double aplicarIVA(Double monto){
        return this.calculadora.aplicarIncremento(monto,22.0);
    }

    public Double aplicarImpuestoALaVenta(Double monto) {
        return this.calculadora.aplicarIncremento(monto,50.0);
    }
    //200 metodos mas
}
