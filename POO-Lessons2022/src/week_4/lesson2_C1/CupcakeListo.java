package week_4.lesson2_C1;

public class CupcakeListo extends Cupcake {
    //atributos
    private String topping;
    //constructor
    public CupcakeListo(String topping, String tipoDeMasa, String sabor){
        //invoco al constructor del padre
        super(tipoDeMasa, sabor);
        this.topping = topping;

    }

    //metodos

    public void serRegalado(){
        System.out.println("Me regalo a ti, mi amor");
    }

    @Override
    public void serExhibido(){
        System.out.println("Estoy implementando un metodo que el padre me obliga");
    }
}
