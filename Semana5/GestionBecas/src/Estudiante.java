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

    public double getPromedio() {
        return promedio;
    }

    public double getValorMatricular() {
        return valorMatricular;
    }

    public  void mostrarDatos (){
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Promedio: "+promedio);
        System.out.println("Matricula: "+valorMatricular);
    }

    public abstract double calcularPagoFinal();

}
