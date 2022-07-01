package week_7.lesson1_C6.singleton;

public class Calculadora {

    //atributos
    private static Calculadora calculadora;
    //constructor
    private Calculadora(){

    }

    public static Calculadora getInstance(){
        if(calculadora == null) {
            calculadora = new Calculadora();
        }
        return calculadora;
    }



    //metodos
    public Double aplicarDescuentos(Double monto, Double porcetanjeDescuento){
            return monto*(100-porcetanjeDescuento);
    }

    public Double aplicarIncremento(Double monto, Double porcetanjeIncremento){
        return monto*(100+porcetanjeIncremento);
    }

    public Double restarMonto(Double monto, Double cantidadARestar){
        return monto - cantidadARestar;
    }

    public Double sumarMonto(Double monto, Double cantidadASumar){
        return monto + cantidadASumar;
    }



}
