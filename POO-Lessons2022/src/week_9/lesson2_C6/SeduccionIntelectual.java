package week_9.lesson2_C6;

public class SeduccionIntelectual implements SeduccionStrategy{
    @Override
    public void saludar() {
        System.out.println("Buenas noches, es un agrado ver su bella persona");
    }

    @Override
    public void conversar() {
        System.out.println("Eso que acaba de proferir es demasiado interesante");

    }

    @Override
    public void pagar() {
        System.out.println("Creo que es una buena idea que yo me respozabilice por el pago de nuestros consumos");

    }

    @Override
    public void despedirse() {
        System.out.println("Adios, persona de mi agrado");

    }
}
