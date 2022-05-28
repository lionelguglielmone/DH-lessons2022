package week_2.lesson3;

public class ProgramC1 {
    public static void main(String[] args) {
        Impresora impresora = new Impresora("HP",true);
        impresora.setCantidadDeHojas(0);

        System.out.println("La marca de su impresora es: " + impresora.getModelo());

        impresora.imprimir("esta impresion es de prueba");

    }
}
