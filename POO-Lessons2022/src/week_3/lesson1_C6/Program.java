package week_3.lesson1_C6;

//

public class Program {
    public static void main(String[] args) {

        /*

        Carpintero manuel = new Carpintero("Manuel");

        Martillo martilloMadera = new Martillo("madera");

        manuel.usarHerramienta(martilloMadera);

         */



        Armadura batiArmadura = new Armadura("Bati Armadura");

        Superheroe batman = new Superheroe("Batman",batiArmadura);

        System.out.println("La armadura de Batman es: " + batman.getArmadura());

    }

}
