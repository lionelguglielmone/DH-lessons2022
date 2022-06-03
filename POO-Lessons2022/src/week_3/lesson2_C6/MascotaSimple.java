package week_3.lesson2_C6;

public class MascotaSimple {
    //atributos
    private String tipo;
    private double peso;
    private String nombreDuenio;
    private boolean primeraVez;
    //constructor

    public MascotaSimple(String tipo) {
        this.tipo = tipo;
    }

    //metodos
    public void serAtendido(){

        System.out.println("Soy un " + this.tipo + " y estoy siendo atendido");
    }

}
