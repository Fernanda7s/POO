public class HabitacionFamiliar extends Habitacion{
    private int capacidadPersonas;
    private double descuento;
    public HabitacionFamiliar(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches,boolean disponible) {
        super(codigo, tipoHabitacion, tarifaBase, numeroNoches, disponible);
        this.capacidadPersonas=capacidadPersonas;
        this.descuento=descuento;
    }

    @Override
    public double calcularHOspedaje() {
        return (getTarifaBase()*getNumeroNoches())-descuento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo Habitacion: Habitacion Familiar");

    }

    @Override
    public double disponibilidad() {
        return 0;
    }
}
