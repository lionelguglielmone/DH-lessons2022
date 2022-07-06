package week_8.lesson1_C6;

public class FactoryProductos {
    private static FactoryProductos instancia;

    private FactoryProductos(){

    }

    public static FactoryProductos getInstance(){
        if(instancia == null) {
            instancia = new FactoryProductos();
        }
        return instancia;

    }

    public Comprable crearProductoComprable(String nombreComprable){
        switch (nombreComprable){
            case "premium":
                ComboComposite premium = new ComboComposite("premium");
                premium.addProducto(new Sandwich("doble queso",12.5));

                Acompanamiento papas = new Acompanamiento("papas",10.2,"grande");
                Acompanamiento bebida = new Acompanamiento("bebida",8.75,"grande");
                premium.addProducto(papas);
                premium.addProducto(bebida);
                return premium;
            case "doble queso":
                return new Sandwich("doble queso",12.5);
            case "coca":
                return new Acompanamiento("bebida coca", 20.1,"extra grande");
            default:
                return null;
        }
    }
}
