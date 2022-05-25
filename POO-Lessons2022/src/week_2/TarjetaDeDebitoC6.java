package week_2;

public class TarjetaDeDebitoC6 {
    //atributos
    private double saldo;
    private String nombreDelTitular;
    private int numeroTarjeta;
    private String fechaVencimiento;

    //constructor

    public TarjetaDeDebitoC6(String nombreDelTitular, int numeroTarjeta, String fechaVencimiento) {
        this.nombreDelTitular = nombreDelTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.saldo = 0;
    }

    //metodos

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreDelTitular() {
        return nombreDelTitular;
    }

    public void setNombreDelTitular(String nombreDelTitular) {
        this.nombreDelTitular = nombreDelTitular;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
