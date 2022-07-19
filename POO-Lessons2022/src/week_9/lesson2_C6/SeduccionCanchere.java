package week_9.lesson2_C6;

public class SeduccionCanchere implements SeduccionStrategy{

    @Override
    public void saludar() {
        System.out.println("Que haces, bestia.. como andas?");
    }

    @Override
    public void conversar() {
        System.out.println("Cheee.. re loco, chabon... muy piola lo que me contas");

    }

    @Override
    public void pagar() {
        System.out.println("DAle.. joya.. vamo a media?");

    }

    @Override
    public void despedirse() {
        System.out.println("Nos vamos juntos o que?");

    }
}
