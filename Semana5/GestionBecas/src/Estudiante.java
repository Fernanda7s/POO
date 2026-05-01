public abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricular;
    public Estudiante(String codigo, String nombre,double promedio, double valorMatricular){
        this.codigo=codigo;
        this.nombre=nombre;
        this.promedio=promedio;
        this.valorMatricular=valorMatricular;

    }
}
