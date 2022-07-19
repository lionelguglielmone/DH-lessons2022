package week_9.lesson2_C6;

public class Programa {
    public static void main(String[] args) {
        //Juan asiste a un boliche/disco
        PersonaEnLaDIsco juan = new PersonaEnLaDIsco("Juan");

        //primero, se cruza con una persona que parece muy intelectual

        SeduccionStrategy intelectual = new SeduccionIntelectual();

        juan.setMiEstrategia(intelectual);
        juan.saludar(); //lapersona se asusta y se va

        //luego, se cruza con otra persona que parece muy canchere
        SeduccionStrategy canchere = new SeduccionCanchere();
        juan.setMiEstrategia(canchere);
        juan.saludar(); //se va
        //finalmente, charla con un extranjere
        SeduccionStrategy extranjere = new SeduccionExtrajere();
        juan.setMiEstrategia(extranjere);
        juan.saludar();
        juan.conversar();
        juan.pagar();
        juan.despedirse();

        juan.saludar2("extranjere");

    }
}
