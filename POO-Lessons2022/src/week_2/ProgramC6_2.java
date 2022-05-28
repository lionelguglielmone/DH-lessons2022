package week_2;

public class ProgramC6_2 {
    public static void main(String[] args) {

        //ESCENARIO 0: Se contrataron 3 cocineros de cupacakes nuevos y se desea saber cual es el cupcake de mejor sabor
        //Cocinero 1: manolo
        //Cocinera 2: maria
        //Cocinera 3: jacinta
        CupcakeC6 cupcakeManolo = new CupcakeC6("chocolate");
        CupcakeC6 cupcakeMaria = new CupcakeC6("chocolate");
        CupcakeC6 cupcakeJacinta = new CupcakeC6("chocolate");







        CupcakeC6 cupcakeParaDelfi = new CupcakeC6("chocolate","chocolatoso",false,"frambuesa");

        System.out.println("El cupcake de Delfi es de: " + cupcakeParaDelfi.getSabor());

        CupcakeC6 cupcakeParaJuanito = new CupcakeC6("vainilla", "vainilloso",true, "chocolate");
        System.out.println("El cupcake de Juanito es de: " + cupcakeParaJuanito.getSabor());

        CupcakeC6 cupcakeParaMatu = new CupcakeC6("chocolate","chocolatoso",false,"frambuesa");
        System.out.println("El cupcake de Matu es de: " + cupcakeParaMatu.getSabor());



        CupcakeC6.setPrecio(300);

        System.out.println("El precio del cupcake de Delfi es: " + cupcakeParaDelfi.getPrecio());
        System.out.println("El precio del cupcake de Juanito es: " + cupcakeParaJuanito.getPrecio());
        System.out.println("El precio del cupcake de MAtu es: " + cupcakeParaMatu.getPrecio());





    }
}
