package week_7.lesson1_C1.factory2;

public class Program {
    public static void main(String[] args) {

        Empleado pepe = EmpleadoFactory.fabricarEmpleado("EMP-PH");
        Double sueldoPepe = pepe.calcularSueldo(20);
        System.out.println("Pepe trabaja por hora y gana: " + sueldoPepe);

        Empleado pepa = EmpleadoFactory.fabricarEmpleado("EMP-RD");
        Double sueldoPepa = pepa.calcularSueldo(20);
        System.out.println("Pepa trabaja mensualmente y gana: " + sueldoPepa);



    }

}
