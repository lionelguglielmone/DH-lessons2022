package week_9.finalRepaso_C1;

public class VendibleFactory {
    private static VendibleFactory instancia;

    private VendibleFactory(){

    }

    public static VendibleFactory getInstance(){
        if(instancia == null){
            instancia = new VendibleFactory();
        }
        return instancia;
    }


    public Vendible crearVendible(String s){
        switch (s){
            case "Life":
                return new JuegoDeMesa("Life",2,6,50.0);
            case "Spiderman":
                return new Juguete("Spiderman",40.0,5);
            case "Combo navideno":
                Combo comboNavideno = new Combo("223344",0.15);
                comboNavideno.agregarVendible(new JuegoDeMesa("Life",2,6,50.0));
                comboNavideno.agregarVendible(new Juguete("Spiderman",40.0,5));
                comboNavideno.agregarVendible(new Juguete("Spiderman",40.0,5));
                comboNavideno.agregarVendible(new Disfraz("Iron Man",20.0,"M"));
                return comboNavideno;
            default:
                return null;
        }
    }

}
