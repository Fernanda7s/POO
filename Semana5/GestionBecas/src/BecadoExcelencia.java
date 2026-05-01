public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;
    public BecadoExcelencia(String codigo, String nombre, double promedio, double valorMatricula, double procentajeBeca, double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, procentajeBeca);
       this.bonoExcelencia=bonoExcelencia;

    }
    @Override
    public double calculaPagoFinal(){
        double pago = super.calcularPagoFinal()-bonoExcelencia;
        if (pago <0){
            return 0;
        }
        return pago;
    }
    @Override
    public void mostrarDatos (){
        System.out.println("Bono excelencia: $" + bonoExcelencia);
        System.out.println("Pago final con bono: $" + calcularPagoFinal());
    }
}
