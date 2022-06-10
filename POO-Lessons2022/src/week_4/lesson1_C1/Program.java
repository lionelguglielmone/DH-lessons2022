package week_4.lesson1_C1;

import week_4.lesson2_C1.Impresora;
import week_4.lesson2_C1.ImpresoraCanon;

public class Program {
    public static void main(String[] args) {

        //CupcakeListo cupcakeDeMirko = new CupcakeListo("chocolate","avena","vainilla");

        //cupcakeDeMirko.serRegalado();

        //cupcakeDeMirko.serComido();

        ImpresoraCanon impresora = new ImpresoraCanon("4545",52,56.5);
        impresora.necesitaTinta();
        impresora.imprimir();
    }
}
