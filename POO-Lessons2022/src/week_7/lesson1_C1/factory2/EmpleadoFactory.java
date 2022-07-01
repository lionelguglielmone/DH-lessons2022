package week_7.lesson1_C1.factory2;

public class EmpleadoFactory {
    //atributos

    //constructor

    //metodos
    public static Empleado fabricarEmpleado(String tipoDeEmpleado){
        switch (tipoDeEmpleado) {
            case "EMP-RD":
                return new EmpleadoRelacionDependencia("","",0000,1000.0);
            case "EMP-PH":
                return new EmpleadoContratado("","",0000,7.0,14.0);
            default:
                return null;
        }

    }



}
