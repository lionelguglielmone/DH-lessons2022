package week_2.lesson2_C6;

public class Program {
    public static void main(String[] args) {

        //ESCENARIO 0: Se contrataron 3 cocineros de cupacakes nuevos y se desea saber cual es el cupcake de mejor sabor
        //Cocinero 1: manolo
        //Cocinera 2: maria
        //Cocinera 3: jacinta
        Cupcake cupcakeManolo = new Cupcake("chocolate");
        Cupcake cupcakeMaria = new Cupcake("chocolate");
        Cupcake cupcakeJacinta = new Cupcake("chocolate");







        Cupcake cupcakeParaDelfi = new Cupcake("chocolate","chocolatoso",false,"frambuesa");

        System.out.println("El cupcake de Delfi es de: " + cupcakeParaDelfi.getSabor());

        Cupcake cupcakeParaJuanito = new Cupcake("vainilla", "vainilloso",true, "chocolate");
        System.out.println("El cupcake de Juanito es de: " + cupcakeParaJuanito.getSabor());

        Cupcake cupcakeParaMatu = new Cupcake("chocolate","chocolatoso",false,"frambuesa");
        System.out.println("El cupcake de Matu es de: " + cupcakeParaMatu.getSabor());



        Cupcake.setPrecio(300);

        System.out.println("El precio del cupcake de Delfi es: " + cupcakeParaDelfi.getPrecio());
        System.out.println("El precio del cupcake de Juanito es: " + cupcakeParaJuanito.getPrecio());
        System.out.println("El precio del cupcake de MAtu es: " + cupcakeParaMatu.getPrecio());





    }
}
