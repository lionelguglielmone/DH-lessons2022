package week_7.lesson1_C1.factory2;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private Integer legajo;

    public Empleado(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    public abstract Double calcularSueldo(Integer dias);
}
