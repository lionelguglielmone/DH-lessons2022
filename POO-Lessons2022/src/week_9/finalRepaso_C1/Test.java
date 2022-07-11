package week_9.finalRepaso_C1;

public class Test {
    public static void main(String[] args) {
        VendibleFactory f = VendibleFactory.getInstance();
        Vendible life = f.crearVendible("Life");
        Vendible spiderman = f.crearVendible("Spiderman");
        Vendible combo = f.crearVendible("Combo navideno");

        Jugueteria jugueteria = new Jugueteria();
        jugueteria.agregarProducto(life);
        jugueteria.agregarProducto(spiderman);
        jugueteria.agregarProducto(combo);

        jugueteria.generarReporte();




    }
}
