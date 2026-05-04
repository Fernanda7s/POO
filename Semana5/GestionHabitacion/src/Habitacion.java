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
       if (tarifaBase>0){
           this.tarifaBase=tarifaBase;
       }else{
           System.out.println("Solo numeros mayores a 0");

       }
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        if (getNumeroNoches()>0){
            this.numeroNoches=numeroNoches;
        }else {
            System.out.println("Solo numeros mayores a 0");
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    double hospedajeBase (){
        return tarifaBase*numeroNoches;
    }
    double descuentoNches (){
        if (numeroNoches>5){
            return ( hospedajeBase()* 0.10);
        }else {
            return 0;
        }
    };
    double descuentoCliente (boolean frecuente){
        if (frecuente){
            return (hospedajeBase() * 0.05);
        }else {
            return 0;
        }
    }
    double iva(boolean frecuente){
        double sutotal= (hospedajeBase()-descuentoNches()-descuentoCliente(frecuente))*0.15;
        return sutotal;
    }

    double formulaGeneral(boolean frecuent, double recargo){
        return hospedajeBase()-descuentoCliente(frecuent)-descuentoNches()+iva(frecuent)+recargo;
    }
    public abstract double calcularHOspedaje();

    public abstract double disponibilidad();
    public abstract void mostrarDetalles();

}
