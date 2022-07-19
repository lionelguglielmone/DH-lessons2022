package week_9.lesson2_C6;

public class SeduccionExtrajere implements SeduccionStrategy {

    @Override
    public void saludar() {
        System.out.println("Hello, how are you?");
    }

    @Override
    public void conversar() {
        System.out.println("The cat is under the table");

    }

    @Override
    public void pagar() {
        System.out.println("This is on me, sweetheart");

    }

    @Override
    public void despedirse() {
        System.out.println("Hope to see ya again");

    }
}
