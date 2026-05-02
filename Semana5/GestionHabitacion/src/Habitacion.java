public abstract class Habitacion {
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;
    public Habitacion(String codigo, String tipoHabitacion,double tarifaBase, int numeroNoches, boolean disponible){
        this.codigo=codigo;
        this.tipoHabitacion=tipoHabitacion;
        this.tarifaBase=tarifaBase;
        this.numeroNoches=numeroNoches;
        this.disponible=disponible;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract double calcularHOspedaje();
    public abstract void mostrarDetalles();
    public abstract double disponibilidad();
}
