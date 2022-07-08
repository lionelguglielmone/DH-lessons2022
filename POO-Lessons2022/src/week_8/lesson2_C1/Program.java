package week_8.lesson2_C1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Carrito carritoDeMarcos = new Carrito("marcos");

        //productos sueltos
        Sandwich hamburguesaQueso = new Sandwich("hamburguesa queso",20.2);
        Sandwich hamburguesaBacon = new Sandwich("hamburguesa bacon",23.2);
        Sandwich hamburguesaVeggie = new Sandwich("hamburguesa veggie",25.2);

        Acompanamiento papas = new Acompanamiento("papas fritas", 17.5);
        Acompanamiento ensalada = new Acompanamiento("ensalada", 18.5);

        Bebida pepsiLight = new Bebida("Pepsi Light",12.78);
        Bebida coca = new Bebida("Coca",13.00);

        //combos
        ArrayList<Comprable> productosDelCombo1 = new ArrayList<>();
        productosDelCombo1.add(hamburguesaQueso);
        productosDelCombo1.add(papas);
        productosDelCombo1.add(coca);

        Combo comboBase = new Combo("combo base",productosDelCombo1);

        carritoDeMarcos.agregarAlCarrito(comboBase);
        carritoDeMarcos.agregarAlCarrito(comboBase);
        carritoDeMarcos.agregarAlCarrito(hamburguesaVeggie);
        carritoDeMarcos.agregarAlCarrito(pepsiLight);


        System.out.println("El total de " + carritoDeMarcos.getDuenio() + " es: " + carritoDeMarcos.leerTotal());




    }
}
