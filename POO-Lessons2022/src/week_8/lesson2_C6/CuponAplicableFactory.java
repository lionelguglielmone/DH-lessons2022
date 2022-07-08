package week_8.lesson2_C6;

public class CuponAplicableFactory {
    private static CuponAplicableFactory instancia;

    private CuponAplicableFactory(){

    }

    public static CuponAplicableFactory getInstance(){
        if(instancia == null){
            instancia = new CuponAplicableFactory();
        }
        return instancia;
    }

    public CuponAplicable fabricarProducto(String s){
        switch (s){
            case "Life":
                return new JuegoDeMesa("Life",2,6,50.0);
            case "Spiderman":
                return new Juguete("Spiderman",5,40.0);
            case "Combo navideno":
                JuegoDeMesa life = new JuegoDeMesa("Life",2,6,50.0);
                Juguete spiderman = new Juguete("Spiderman",5,40.0);
                Disfraz ironMan = new Disfraz("Iron man","M",20.0);
                CompositeCombo comboNavidad = new CompositeCombo(223344);
                comboNavidad.agregarProducto(life);
                comboNavidad.agregarProducto(spiderman);
                comboNavidad.agregarProducto(spiderman);
                comboNavidad.agregarProducto(ironMan);

                return comboNavidad;
            default:
                return null;
        }
    }

}
