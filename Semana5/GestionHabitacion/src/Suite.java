public  class Suite extends Habitacion {
    private boolean jacuzzi;
    private double sericoPremiun;

    public Suite(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches,boolean disponible) {
        super(codigo, tipoHabitacion, tarifaBase, numeroNoches,  disponible);
        this.jacuzzi=jacuzzi;
        this.sericoPremiun=sericoPremiun;
    }



    @Override
    public double calcularHOspedaje() {

        return (getTarifaBase()+getNumeroNoches())+sericoPremiun;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo Habitacion: Suite");

    }

    @Override
    public double disponibilidad() {
        return 0;
    }
}
