package week_5.lesson1_C6;

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
        //logica
        return 2.1;
    }



}
