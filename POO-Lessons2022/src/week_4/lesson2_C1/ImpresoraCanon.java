package week_4.lesson2_C1;

public class ImpresoraCanon extends Impresora{
    //atributos

    //constructor

    public ImpresoraCanon(String modelo, int hojas, double porcentajeTinta) {
        super(modelo, hojas, porcentajeTinta);
    }

    //metodos
    @Override
    public boolean necesitaTinta(){
        return getPorcentajeTinta() <= 20;
    }
    @Override
    public String imprimir(){
        System.out.println("Estoy imprimiendo con el flow que imprime la impresora Canon");
        return "Estoy imprimiendo con el flow que imprime la impresora Canon";
    };
}
