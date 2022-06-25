package week_6.lesson2_C1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Juan Sosa", "AFF10101025", 5000.0);

            Scanner scanner = new Scanner(System.in);

            cliente.setSaldoEnCuenta(200.0);

            System.out.println("Cuanto vale lo que quiere comprar? ");
            Double precio = scanner.nextDouble();

            cliente.comprar(precio);

            System.out.println("saldo: " + cliente.getSaldoEnCuenta());


        } catch(ClienteException e){
            System.err.println("error");
        }

    }
}
