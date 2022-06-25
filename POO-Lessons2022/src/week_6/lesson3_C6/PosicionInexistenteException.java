package week_6.lesson3_C6;

public class PosicionInexistenteException extends Exception{

    public PosicionInexistenteException(){
        super();
    }
    public PosicionInexistenteException(String mensaje){
        super(mensaje);
    }
}
