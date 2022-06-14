package week_5.lesson1_C1;

public class CuentaCorriente extends Cuenta implements GravadorDeImpuestos{
    private double descubiertoPermitido;



    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }



    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }



    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido <= monto)
            setSaldo(informarSaldo() - monto);
    }

    @Override
    public double gravar(double porcentaje){
        double montoDescuento = getSaldo()*porcentaje;
        double montoActualizado = getSaldo() - montoDescuento;
        this.setSaldo(montoActualizado);
        return montoDescuento;
    }

}
