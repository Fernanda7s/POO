public class HabitacionFamiliar extends Habitacion{
    private int capacidadPersonas;
    private double descuento;
    public HabitacionFamiliar(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible, int capacidadPersonas,double descuento) {
        super(codigo, tipoHabitacion, tarifaBase, numeroNoches, disponible);
        this.capacidadPersonas=capacidadPersonas;
        this.descuento=descuento;
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
