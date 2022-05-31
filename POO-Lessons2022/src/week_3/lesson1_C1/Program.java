package week_3.lesson1_C1;

public class Program {

    public static void main(String[] args) {

        /* En la mesa de trabajo pasada nos surgieron estas preguntas: 1) ¿Para crear dos constructores debemos crear dos clases?
        2) ¿Se puede crear una clase vacía (sin atributos, sin métodos)?
        3) En el ejemplo de la institución que adopta perros, los atributos eran de los perros, excepto decidir
        si eran adoptables o no. Como el ejercicio proponía dos constructores, no supimos si dejarle la responsabilidad
        de decidir si el perro era adoptable o no a una clase "Institución" o en el Main de la clase Perro
         */

        NuevoTiempo edicionUno = new NuevoTiempo(2020,"semanal",1);
        NuevoTiempo edicionDos = new NuevoTiempo(2020,"semanal",2);


    }
}
