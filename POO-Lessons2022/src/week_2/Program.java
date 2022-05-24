package week_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TarjetaDeDebito tarjetaSofi = new TarjetaDeDebito("Sofia Volpedo", "23-05-2027", 45464200);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sofi, ingresa cuanta plata queres poner en tu cuenta");
        double dinero = scanner.nextDouble();



        tarjetaSofi.setSaldo(dinero);
        double cuantaPlataTieneSofiAhora = tarjetaSofi.getSaldo();
        System.out.println("Sofi tiene: " + cuantaPlataTieneSofiAhora);
    }
}
