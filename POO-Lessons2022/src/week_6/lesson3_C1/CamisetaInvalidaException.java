package week_6.lesson3_C1;

public class CamisetaInvalidaException extends Exception{
    public CamisetaInvalidaException(){
        super();
    };
    public CamisetaInvalidaException(String mensaje){
        super(mensaje);
    }
}
