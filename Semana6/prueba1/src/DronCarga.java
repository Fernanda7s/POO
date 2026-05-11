public class DronCarga extends Dron {
    private double costoPorKg;

    public DronCarga(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double costoPorkg) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.costoPorKg = costoPorkg;
    }

    public double getCostoPorkg() {
        return costoPorKg;
    }

    public void setCostoPorkg(double costoPorkg) {
        if (costoPorKg > 0) {
            this.costoPorKg = costoPorkg;
        }
    }

    @Override
    double calcularCostoEntrega() {
        return costoBase +
                (getDistanciaKm() * 0.70) +
                (getPesoPaquete() * costoPorKg);
    }

    @Override
    boolean validarDatos() {
        return getPesoPaquete() <= 30 &&
                getHorasVuelo() <= 5;
    }
    @Override
    public void mostrarInformacion() {

        System.out.println("\n--- Dron Carga ---");

        super.mostrarInformacion();

        System.out.println("Costo por kg: "
                + costoPorKg);

        System.out.println("Costo entrega: "
                + calcularCostoEntrega());
    }
}
