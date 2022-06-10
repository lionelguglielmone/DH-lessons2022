package week_4.lesson2_C1;

public abstract class Cupcake {

    private String tipoMasa;
    private String sabor;

    //constructor

    public Cupcake(String tipoMasa, String sabor) {
        this.tipoMasa = tipoMasa;
        this.sabor = sabor;
    }



    //metodos
    public void serComido(){
        System.out.println("Estoy siendo comido con mis manitas");
    }

    public abstract void serExhibido();
}
