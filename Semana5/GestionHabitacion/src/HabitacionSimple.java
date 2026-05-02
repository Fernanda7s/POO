public class HabitacionSimple extends Habitacion {
    private boolean desayunoIncluido;
    private double costoServicioBasico;

    public HabitacionSimple(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible, boolean desayunoIncluido, double costoServicioBasico) {
        super(codigo, tipoHabitacion, tarifaBase, numeroNoches, disponible);
    }

    @Override
    public double calcularHOspedaje() {
        return 0;
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public double disponibilidad() {
        return 0;
    }

}
