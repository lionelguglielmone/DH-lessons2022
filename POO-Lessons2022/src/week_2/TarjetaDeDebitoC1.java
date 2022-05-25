package week_2;

public class TarjetaDeDebitoC1 {
    //atributos
    private String nombreTitular;
    private int numeroTarjeta;
    private String fechaVencimiento;
    private double saldo = 0;


    //constructor

    public TarjetaDeDebitoC1(String nombre, String fechaVencimiento, int numero){
        this.nombreTitular = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.numeroTarjeta = numero;
    }


    //metodos

    public void setSaldo(double plata){
        this.saldo += plata;

    }
    public String getNombreTitular() {
        return nombreTitular;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(){
        //logica
    }
    public void comprar(){
        //logica
    }

}