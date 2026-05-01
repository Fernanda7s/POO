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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setValorMatricular(double valorMatricular) {
        this.valorMatricular = valorMatricular;
    }
}
