package week_4.lesson3_C1;

public class Program {
    public static void main(String[] args) {


        CajaAhorro ca = new CajaAhorro();
        //ca.setSaldo(100);
        //ca.depositar(100);
        //ca.cobrarIntereses();

        //System.out.println(ca.informarSaldo());
        ca.depositarDolares(100);
        System.out.println(ca.informarSaldoDolares());
        ca.depositarDolares(100,30);

        ca.cobrarIntereses();
        System.out.println(ca.informarSaldo());

        ca.cobrarIntereses("Juana");
        System.out.println(ca.informarSaldo());

    }

}
