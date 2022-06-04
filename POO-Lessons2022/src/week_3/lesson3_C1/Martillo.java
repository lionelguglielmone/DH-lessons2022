package week_3.lesson3_C1;

public class Martillo {
    //atributos
    private String tipo;
    private boolean encendido;
    //constructor

    public Martillo(String tipo) {
        this.tipo = tipo;
        this.encendido = false;
    }



    //metodos
    public void martillar(){

        System.out.println("Pum pum pum");
    }
    public void encender(){
        this.encendido = true;

    }
}
