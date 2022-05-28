package week_2;


public class ProgramC1_2 {
    public static void main(String[] args) {
        CupcakeC1 cupcakeDeChocolate =  new CupcakeC1("C","chocolate","chocolate",false);
        System.out.println("El sabor de su cupcake es: " + cupcakeDeChocolate.getSabor());

        CupcakeC1 cupcakesDeVainilla = new CupcakeC1("G","vainilla","frambuesa",true);
        System.out.println("El sabor de su cupcake es: " + cupcakesDeVainilla.getSabor());

        //cupcakeDeChocolate.setPrecio(10);
        //cupcakesDeVainilla.setPrecio(10);


        CupcakeC1.setearPrecio(10);
        System.out.println("valor precio cupacake chocolate: " + cupcakeDeChocolate.getPrecio());
        System.out.println("valor precio cupacake vainilla: " + cupcakeDeChocolate.getPrecio());




    }

}
