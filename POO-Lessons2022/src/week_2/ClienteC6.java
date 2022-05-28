package week_2;

public class ClienteC6 {
    //atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;
    //constructor
    public ClienteC6(Integer numero, String nombre){
        numeroCliente = numero;
        this.nombre = nombre;
    }
    //metodos
    public void incrementarDeuda(Double valor){
        deuda += valor;
    }
    public void pagarDeuda(){
        //logica
    }
}
