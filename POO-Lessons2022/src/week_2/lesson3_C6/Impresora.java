package week_2.lesson3_C6;

public class Impresora {
    //atributos
    private String modelo;
    private boolean conexionUSB;
    private String fechaFabricacion;
    private int cantidadDeHojas;

    //constructor
    public Impresora(String modelo, boolean conexionUSB, String fechaFabricacion){
        this.modelo = modelo;
        this.conexionUSB = conexionUSB;
        this.fechaFabricacion = fechaFabricacion;
    }

    public Impresora(String modelo, boolean conexionUSB){
        this.modelo = modelo;
        this.conexionUSB = conexionUSB;
    }

    //metodos
    public boolean tienePapel(){
        if (cantidadDeHojas>0){
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(String texto){
        //imprime
        this.cantidadDeHojas--;
    }
}
