package week_6.lesson2_C1;

public class Cliente {
    //atributos
    private String nombreApellido;
    private String DNI;
    private Double saldoEnCuenta;
    private Double deuda;
    private Double limite;
    //constructor

    public Cliente(String nombreApellido, String DNI, Double limite) {
        this.nombreApellido = nombreApellido;
        this.DNI = DNI;
        this.limite = limite;
    }

    public void comprar(Double importe) throws ClienteException {
        if (this.saldoEnCuenta < importe) {
            throw new ClienteException("error");
        }
        this.saldoEnCuenta = this.saldoEnCuenta - importe;
        //this.saldoEnCuenta -= importe;
    }

    public void pagar(Double monto) {

    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public void setSaldoEnCuenta(Double saldoEnCuenta) {
        this.saldoEnCuenta = saldoEnCuenta;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    //metodos
}
