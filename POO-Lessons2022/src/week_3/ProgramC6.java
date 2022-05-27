package week_3;

public class ProgramC6 {
    public static void main(String[] args) {
        CupcakeC6 cupcakeParaDelfi = new CupcakeC6("chocolate","chocolatoso",false,"frambuesa");

        System.out.println("El cupcake de Delfi es de: " + cupcakeParaDelfi.getSabor());

        CupcakeC6 cupcakeParaJuanito = new CupcakeC6("vainilla", "vainilloso",true, "chocolate");
        System.out.println("El cupcake de Juanito es de: " + cupcakeParaJuanito.getSabor());

        CupcakeC6 cupcakeParaMatu = new CupcakeC6("chocolate","chocolatoso",false,"frambuesa");
        System.out.println("El cupcake de Matu es de: " + cupcakeParaMatu.getSabor());

    }
}
