public abstract class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;
    public EstudianteBecado(String codigo,String nombre,double promedio, double valorMatricula, double procentajeBeca){
        super(codigo,nombre,promedio,valorMatricula);
        this.porcentajeBeca=procentajeBeca;
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricular() -(getValorMatricular()*porcentajeBeca);
    }

    public abstract double calculaPagoFinal();

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Beca: " + porcentajeBeca + "%");
        System.out.println("Pago final: $" + calcularPagoFinal());

    }



}
