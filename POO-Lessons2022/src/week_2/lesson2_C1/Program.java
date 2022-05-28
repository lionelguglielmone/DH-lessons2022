package week_2.lesson2_C1;


public class Program {
    public static void main(String[] args) {
        Cupcake cupcakeDeChocolate =  new Cupcake("C","chocolate","chocolate",false);
        System.out.println("El sabor de su cupcake es: " + cupcakeDeChocolate.getSabor());

        Cupcake cupcakesDeVainilla = new Cupcake("G","vainilla","frambuesa",true);
        System.out.println("El sabor de su cupcake es: " + cupcakesDeVainilla.getSabor());

        //cupcakeDeChocolate.setPrecio(10);
        //cupcakesDeVainilla.setPrecio(10);


        Cupcake.setearPrecio(10);
        System.out.println("valor precio cupacake chocolate: " + cupcakeDeChocolate.getPrecio());
        System.out.println("valor precio cupacake vainilla: " + cupcakeDeChocolate.getPrecio());




    }

}
