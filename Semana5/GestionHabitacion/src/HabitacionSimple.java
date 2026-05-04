public class HabitacionSimple extends Habitacion {
    private boolean desayunoIncluido;
    private double costoServicioBasico;

    public HabitacionSimple(String codigo, String tipoHabitacion,double tarifaBase,int numeroNoches, boolean disponible) {
        super(codigo, tipoHabitacion, tarifaBase, numeroNoches, disponible);
    }
    @Override
    public double disponibilidad() {
        return 0;
    }


    @Override
    public double calcularHOspedaje() {
        return (getTarifaBase()*getNumeroNoches())+ costoServicioBasico;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo Habitacion: Habitacion Simple");


    }



}
