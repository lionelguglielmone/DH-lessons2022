package week_1;

import java.util.Scanner;

public class Toolbox {
    public void askForTwoNumbersAddAndReturnResult() {
        System.out.println("BIENVENIDOS A LA CALCULADORA DH. ESTA CALCULADORA PERMITE SUMAR DOS NUMEROS ENTEROS.");
        Scanner elScannerDePepe = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero: ");
        int numeroUno = elScannerDePepe.nextInt();

        System.out.println("Ingrese el segundo numero entero: ");
        int numeroDos = elScannerDePepe.nextInt();

        int resultado = numeroDos + numeroUno;

        System.out.println("El resultado de la operacion es: " + resultado);
    }

    public void askForNameLastNameAndReturnInitials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Cual es tu apellido?");
        String apellido = scanner.nextLine();

        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);
        System.out.println("Tus iniciales son: " + inicialNombre + inicialApellido);
    }

    public void sayIfAnInputNumberIsPrime() {
        System.out.println("BIENVENIDOS! ESTA FUNCION LE PERMITE AVERIGUAR SI UN UN NUMERO ES PRIMO O NO.");
        Scanner elScannerDePepe = new Scanner(System.in);
        System.out.println("Ingrese el numero entero que desea saber si es primo o no: ");
        int numero = elScannerDePepe.nextInt();
        boolean esPrimo = true;
        for(int i=2; i<numero; i++){
            int restoDivision = numero%i;
            if(restoDivision==0){
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado NO es primo");

        }


    }

}
