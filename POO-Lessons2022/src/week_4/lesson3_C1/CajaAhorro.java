package week_4.lesson3_C1;

public class CajaAhorro extends Cuenta{
    public static final double INTERES_CAJA_AHORRO = 1.2;


    @Override
    public void extraer(double monto) {
        if(informarSaldo() <= monto)
            setSaldo(informarSaldo() - monto);

    }

    public void cobrarIntereses() {
        setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);
    }
    public void cobrarIntereses(String nombre) {
        System.out.println("Buen dia " + nombre);
        setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);
    }

    @Override
    public void depositar(double monto){
        setSaldo( informarSaldo() + monto*0.9);
    }

    public void depositarDolares(double monto, Integer cantidadDias){
        //por cada dia que se dejan los dolares, le damos un dolar adicional
        setSaldoDolares(monto + cantidadDias);
    }
}
