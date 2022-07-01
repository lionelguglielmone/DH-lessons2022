package week_7.lesson1_C6.singleton;

public class Program {
    public static void main(String[] args) {
        CajeroSupermercado lola = new CajeroSupermercado("Lola Lolez",25256);

        Double monto = lola.aplicarDescuento(10.0,15278.0);
        System.out.println(monto);

        Contador rodolfo = new Contador("Rodolfo", "UBA");

        Double monto2 = rodolfo.aplicarIVA(200.0);
        System.out.println(monto2);


    }


}
