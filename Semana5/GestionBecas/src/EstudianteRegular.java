public class EstudianteRegular extends Estudiante{
    private int numeroMaterias;
    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricular, int numeroMaterias) {
        super(codigo, nombre, promedio, valorMatricular);
        this.numeroMaterias=numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
}
