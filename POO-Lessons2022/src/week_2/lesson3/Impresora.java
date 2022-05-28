package week_2.lesson3;

import java.util.Date;

public class Impresora {
    //atributos
    private String modelo;
    private boolean esInalambrica;
    private Date fechaDeFabricacion;
    private Integer cantidadDeHojas;

    //constructor
    public Impresora(String modelo, boolean inalambrica){
        this.modelo = modelo;
        this.esInalambrica = inalambrica;
    }

    //metodos
    private boolean hayHojas(){
        if(cantidadDeHojas>0){
            return true;
        } else {
            return false;
        }
    }
    public void imprimir(String texto){
        if (hayHojas()){
            System.out.println(texto);
            this.cantidadDeHojas --;
        } else {
            System.out.println("no hay hojas para imprimir");

        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEsInalambrica() {
        return esInalambrica;
    }

    public void setEsInalambrica(boolean esInalambrica) {
        this.esInalambrica = esInalambrica;
    }

    public Date getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(Date fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }

    public Integer getCantidadDeHojas() {
        return cantidadDeHojas;
    }

    public void setCantidadDeHojas(Integer cantidadDeHojas) {
        this.cantidadDeHojas = cantidadDeHojas;
    }
}
