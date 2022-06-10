package week_4.lesson2_C1;

import java.util.Date;

public abstract class Impresora {

    //atributos
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;
    //constructor
    public Impresora(String modelo, int hojas, double porcentajeTinta){
        this.modelo = modelo;
        this.hojasDisponibles = hojas;
        this.porcentajeTinta = porcentajeTinta;

    }

    //metodos
    public boolean tienePapel(){
        return this.hojasDisponibles > 0;
    }

    public boolean necesitaTinta(){
        return this.porcentajeTinta <= 10;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

    public abstract String imprimir();



}
