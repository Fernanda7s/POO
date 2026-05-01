public class RegularConRecargo extends EstudianteRegular{
    private double recargaPendiente;
    public RegularConRecargo(String codigo, String nombre, double promedio, double valorMatricular, int numeroMaterias, double recargaPendiente) {
        super(codigo, nombre, promedio, valorMatricular, numeroMaterias);
        this.recargaPendiente=recargaPendiente;
    }
}
