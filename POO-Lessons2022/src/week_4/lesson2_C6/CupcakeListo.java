package week_4.lesson2_C6;

public class CupcakeListo extends Cupcake{
    //atributos
    private String topping;

    //constructor
    public CupcakeListo(String sabor, String topping){
        super(sabor);
        this.topping = topping;
    }

    //metodos
    public void serServidoEnTienda(){
        System.out.println("Servir el cupcake al cliente para su deleite");
    }

    public void serVendido(String cupon){
        System.out.println("Vender y aplicar descuento");
    }

    @Override
    public void serExhibido(){
        System.out.println("estoy siendo exhibido como Cupcake Listo");
    }
}
