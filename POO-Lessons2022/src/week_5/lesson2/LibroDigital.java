package week_5.lesson2;

import java.util.Scanner;

public class LibroDigital extends Libro implements Comparable{

    //atributos
    private Double tamanio;
    //constructor

    public LibroDigital(String titulo, String codigo, Double precioLista, Double precioPromocion, Double tamanio) {
        super(titulo, codigo, precioLista, precioPromocion);
        this.tamanio = tamanio;
    }


    //metodos
    @Override
    public Double vender(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido: ");
        String nombreApellido = scanner.nextLine();
        System.out.println("Ingrese tarjeta: ");
        String tarjeta = scanner.nextLine();
        return getPrecioLista()*0.9;    }

    public Double comprimir(){
        return this.tamanio*0.325;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public int compareTo(Object object){
        //devuelve 0 -> son iguales
        //devuelve 1 -> es mayor el libro actual
        //devuelve 2 -> es mayor el libro que recibe

        LibroDigital libroDigital = (LibroDigital) object;
        //logica
        if (this.tamanio == libroDigital.getTamanio()){
            return 0;
        } else if(this.tamanio > libroDigital.getTamanio()){
            return 1;
        }
        else{
            return 2;
        }

    }
}
