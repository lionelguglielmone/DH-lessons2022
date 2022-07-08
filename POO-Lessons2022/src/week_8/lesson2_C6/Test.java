package week_8.lesson2_C6;

public class Test {
    public static void main(String[] args) {

        CuponAplicableFactory f = CuponAplicableFactory.getInstance();
        CuponAplicable sp = f.fabricarProducto("Spiderman");
        CuponAplicable comboN = f.fabricarProducto("Combo navideno");
        CuponAplicable life = f.fabricarProducto("Life");


        System.out.println("Spiderman con descuento" + sp.aplicarDescuento("cupon15"));
        System.out.println("Combo  " + comboN.aplicarDescuento("cupon15"));

        Jugueteria jugueteria = new Jugueteria();
        jugueteria.agregarProducto(sp);
        jugueteria.agregarProducto(comboN);
        jugueteria.agregarProducto(life);

        jugueteria.generarReporte();
    }
}
