package week_2.lesson2_C6;

public class Cliente {
    //atributos
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;
    //constructor
    public Cliente(Integer numero, String nombre){
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
