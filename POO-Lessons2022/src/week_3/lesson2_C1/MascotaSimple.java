package week_3.lesson2_C1;

public class MascotaSimple {
    //atributos
    private String tipoDeAnimal;
    private double peso;
    private String nombreDuenio;
    private int cantidadDePlumas;

    //constructor

    public MascotaSimple(String tipoDeAnimal, double peso) {
        this.tipoDeAnimal = tipoDeAnimal;
        this.peso = peso;
    }

    //metodos

    public void serAtendido(){
        System.out.println("Soy la mascota " + this.tipoDeAnimal + ", y estoy siendo atendido");
    }
}
