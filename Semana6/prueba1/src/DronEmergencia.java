public class DronEmergencia extends Dron{
    private double recargoUrgencias;
    private int nivelPrioridad;

    public DronEmergencia(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double recargoUrgencias, int nivelPrioridad) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.recargoUrgencias = recargoUrgencias;
        this.nivelPrioridad = nivelPrioridad;
    }

    public double getRecargoUrgencias() {
        return recargoUrgencias;
    }

    public void setRecargoUrgencias(double recargoUrgencias) {
        if (recargoUrgencias > 0) {
            this.recargoUrgencias = recargoUrgencias;
        }
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 &&
                nivelPrioridad <= 3) {

            this.nivelPrioridad = nivelPrioridad;
        }
    }
    @Override
    double calcularCostoEntrega() {
        return costoBase +
                (getDistanciaKm() * 1.00) +
                recargoUrgencias;
    }

    @Override
    boolean validarDatos() {
        return getPesoPaquete() <= 10 &&
                getHorasVuelo() <= 3 &&
                nivelPrioridad >= 1 &&
                nivelPrioridad <= 3;
    }
    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- Dron Emergencia ---");

        super.mostrarInformacion();

        System.out.println("Recargo urgencia: "
                + recargoUrgencias);

        System.out.println("Nivel prioridad: "
                + nivelPrioridad);

        System.out.println("Costo entrega: "
                + calcularCostoEntrega());
    }
}
