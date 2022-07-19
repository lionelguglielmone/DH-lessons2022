package week_9.lesson2_C6;

public class PersonaEnLaDIsco {
    private SeduccionStrategy miEstrategia;
    private String nombre;

    public PersonaEnLaDIsco(String nombre) {
        this.nombre = nombre;
    }

    public void setMiEstrategia(SeduccionStrategy ss){
        this.miEstrategia = ss;
    }

    public void saludar(){
        this.miEstrategia.saludar();
    }
    public void conversar(){
        this.miEstrategia.conversar();
    }
    public void pagar(){
        this.miEstrategia.pagar();
    }
    public void despedirse(){
        this.miEstrategia.despedirse();
    }

    public void saludar2(String tipoDePersona){
        if(tipoDePersona.equals("intelectual")){
            System.out.println("Buenas noches, es un agrado ver su bella persona");
        } else if (tipoDePersona.equals("canchere")) {
            System.out.println("Que haces, bestia.. como andas?");

        } else{
            System.out.println("Hello, how are you?");
        }
    }

}
