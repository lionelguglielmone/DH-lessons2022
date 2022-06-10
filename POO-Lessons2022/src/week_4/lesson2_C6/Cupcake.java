package week_4.lesson2_C6;

public abstract class Cupcake {
    //atributos
    private String sabor;
    private double precio;

    //constructor
    public Cupcake(String sabor){
        this.sabor = sabor;
    }

    //metodos
    public void serVendido() {
        System.out.println("Se vendio este cupcake");
    }
    public abstract void serExhibido();
}
