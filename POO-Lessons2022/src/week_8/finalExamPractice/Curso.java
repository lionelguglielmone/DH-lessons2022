package week_8.finalExamPractice;

public class Curso extends OfertaAcademica{
    //atrubutos
    private Double cantHoras;
    private Integer cantMeses;
    private Double precioXHora;
    //constructor


    public Curso(String nombre, String descripcion, Double cantHoras, Integer cantMeses, Double precioXHora) {
        super(nombre, descripcion);
        this.cantHoras = cantHoras;
        this.cantMeses = cantMeses;
        this.precioXHora = precioXHora;
    }

    //metodos
    @Override
    public Double calcularPrecio(){
        return this.cantHoras*this.cantMeses*this.precioXHora;
    }
}
