package week_3.lesson3_C1;

public class Carpintero {

    //atributos
    private String nombre;
    private String direccionTaller;
    private Martillo martillo;

    //constructor

    public Carpintero(String nombre, Martillo martilloMetal) {
        this.nombre = nombre;
        this.martillo = martilloMetal;
    }

    //metodos
    public void fabricarMesa(){
        System.out.println("Soy " + this.nombre + " y estoy fabricando una mesa");
        this.martillo.martillar();
    }

}
