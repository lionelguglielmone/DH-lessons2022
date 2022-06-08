package week_4.lesson1_C6;

public class Program {
    public static void main(String[] args) {

        CupcakeListo cupcakeParaJuanito = new CupcakeListo("chocolate","chocolate");
        cupcakeParaJuanito.serVendido();
        cupcakeParaJuanito.serServidoEnTienda();
        cupcakeParaJuanito.serVendido("cupon 1");

        CupcakeCrypto cambalache = new CupcakeCrypto("chocolate", 203);
        cambalache.serVendido();

    }
}
