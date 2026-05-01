public class RegularConRecargo extends EstudianteRegular{
    private double recargaPendiente;
    public RegularConRecargo(String codigo, String nombre, double promedio, double valorMatricular, int numeroMaterias, double recargaPendiente) {
        super(codigo, nombre, promedio, valorMatricular, numeroMaterias);
        this.recargaPendiente=recargaPendiente;
    }
    @Override
    public double calculaPagoFinal(){
        double pago = super.calcularPagoFinal()-recargaPendiente;
        return pago;
    }
    @Override
    public void mostrarDatos (){
        System.out.println("Recargo pendiente: $" + recargaPendiente);
        System.out.println("Pago Final con recargo: $" + calcularPagoFinal());
    }
}
