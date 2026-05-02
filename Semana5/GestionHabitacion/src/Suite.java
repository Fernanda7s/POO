public  class Suite extends Habitacion {
    private boolean jacuzzi;
    private double sericoPremiun;

    public Suite(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible, boolean jacuzzi, double sericoPremiun) {
        super(codigo, tipoHabitacion, tarifaBase, numeroNoches, disponible);
        this.jacuzzi=jacuzzi;
        this.sericoPremiun=sericoPremiun;
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
