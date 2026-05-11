public class DronLiviano extends Dron{
    private double limiteHoras;

    public DronLiviano(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double limiteHoras) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.limiteHoras = limiteHoras;
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        if (limiteHoras > 0) {
            this.limiteHoras = limiteHoras;
        }
    }

    @Override
    double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.50);
    }

    @Override
    boolean validarDatos() {
        return getPesoPaquete() <= 5 && getHorasVuelo() <= 2;
    }
    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- Dron Liviano ---");

        super.mostrarInformacion();

        System.out.println("Limite de horas: " + limiteHoras);

        System.out.println("Costo entrega: "
                + calcularCostoEntrega());
    }
}
