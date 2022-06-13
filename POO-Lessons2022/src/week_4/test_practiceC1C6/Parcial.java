package week_4.test_practiceC1C6;

public class Parcial extends Examen{
    //atributos
    private Integer unidad;
    private Integer nroReintento;
    //constructor
    public Parcial(Integer unidad, Integer nroReintento, String titulo, String enunciado, double nota){
        super(titulo, enunciado, nota);
        this.unidad = unidad;
        this.nroReintento = nroReintento;
    }

    //metodos
    @Override
    public boolean estaAprobado(){
        //opcion 1
        //if (getNota()>=4) {
        //    return true;
        //}
        //return false;
        //opcion 2
        boolean aprobado = getNota()>=4;
        return aprobado;
    }

    public String sePuedeRecuperar(){
        if (this.unidad <= 3) {
            return "se puede recuperar hasta 3 veces";
        } else {
            return "se puede recuperar hasta 2 veces";
        }
    }
}
