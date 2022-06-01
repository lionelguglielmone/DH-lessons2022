package week_3.lesson1_C6;

public class Carpintero {
    //atributos
    private String nombre;
    //constructor

    public Carpintero(String nombre) {
        this.nombre = nombre;
    }


    //metodos
    public void usarHerramienta(Martillo martilloTipo1){
        //
        System.out.println("Soy el carpintero " + this.nombre + " y estoy usando el martillo");
        martilloTipo1.martillar();

    }

}
