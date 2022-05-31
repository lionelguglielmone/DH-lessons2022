package week_3.lesson1_C1;

public class NuevoTiempo {
    //atributos
    private Integer codigo;
    private String periodicidad;
    private Integer edicion;

    //contructor

    public NuevoTiempo(Integer codigo, String periodicidad, Integer edicion) {
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        this.edicion = edicion;
    }


    //metodos


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
}
