public abstract class EstudianteRegular extends Estudiante{
    private int numeroMaterias;
    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricular, int numeroMaterias) {
        super(codigo, nombre, promedio, valorMatricular);
        this.numeroMaterias=numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricular() +(numeroMaterias *10);
    }

    public abstract double calculaPagoFinal();

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Materias: " + numeroMaterias);
        System.out.println("Pago final: $" + calcularPagoFinal());
    }


}
