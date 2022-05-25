package week_2;

public class ProgramC6 {
    public static void main(String[] args) {
        TarjetaDeDebitoC6 tarjetaDeLiliana = new TarjetaDeDebitoC6("Liliana",4545,"24/05/2022");
        double resultadoConsultaSaldo = tarjetaDeLiliana.getSaldo();
        System.out.println("El saldo de Liliana es: " + resultadoConsultaSaldo);
        tarjetaDeLiliana.setSaldo(50000);
        resultadoConsultaSaldo = tarjetaDeLiliana.getSaldo();
        System.out.println("El saldo de Liliana es: " + resultadoConsultaSaldo);

    }
}
