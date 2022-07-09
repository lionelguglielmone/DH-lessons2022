package week_8.lesson3_C1;

import java.util.ArrayList;

public class ProgramaIntensivo implements OfertaAcademicaDisponible{

    private String nombre;
    private String descripcion;
    private ArrayList<OfertaAcademicaDisponible> ofertasAcademicas;
    private Double descuento;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.ofertasAcademicas = new ArrayList<>();
    }
    public void agregarOferta(OfertaAcademicaDisponible o){
        this.ofertasAcademicas.add(o);
    }

    @Override
    public Double calcularPrecio() {
        Double precioFinal = 0.0;
        for(OfertaAcademicaDisponible o: this.ofertasAcademicas){
            precioFinal += o.calcularPrecio();
        }
        return precioFinal*(1-this.descuento);
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
}
