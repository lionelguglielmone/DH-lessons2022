package week_2.lesson1_C6;

public class Program {
    public static void main(String[] args) {
        TarjetaDeDebito tarjetaDeLiliana = new TarjetaDeDebito("Liliana",4545,"24/05/2022");
        double resultadoConsultaSaldo = tarjetaDeLiliana.getSaldo();
        System.out.println("El saldo de Liliana es: " + resultadoConsultaSaldo);
        tarjetaDeLiliana.setSaldo(50000);
        resultadoConsultaSaldo = tarjetaDeLiliana.getSaldo();
        System.out.println("El saldo de Liliana es: " + resultadoConsultaSaldo);

    }
}
