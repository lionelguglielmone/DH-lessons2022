package week_4.lesson1_C1;

public class CupcakeElite extends Cupcake{

    //atributos
    private String dobleSabor;

    //constructor
    public CupcakeElite(String dobleSabor, String tipoMasa, String sabor){
        super(tipoMasa, sabor);
        this.dobleSabor = dobleSabor;
    }

    //metodos

    @Override
    public void serComido(){
        System.out.println("Estoy siendo comido con cuchillo y tenedor");
    }
    public void serComido(String nombre){
        System.out.println(nombre + " esta comiendo el cupcake con cuchillo y tenedor");
    }




}
