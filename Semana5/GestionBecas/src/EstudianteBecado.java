public class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;
    public EstudianteBecado(String codigo,String nombre,double promedio, double valorMatricula, double procentajeBeca){
        super(codigo,nombre,promedio,valorMatricula);
        this.porcentajeBeca=procentajeBeca;
    }
}
