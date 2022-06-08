package week_4.lesson1_C6;

public class CupcakeCrypto extends Cupcake{

    //atributos
    private double valorEnCrypto;

    //constructor

    public CupcakeCrypto(String sabor, double valorEnCrypto) {
        super(sabor);
        this.valorEnCrypto = valorEnCrypto;
    }


    //metodos
    @Override
    public void serVendido(){
        System.out.println("se vende en crypto");
    }

}
