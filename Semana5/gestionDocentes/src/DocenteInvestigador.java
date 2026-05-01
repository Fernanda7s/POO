public class DocenteInvestigador extends Docente {

    private double bono;

    // 🔥 Constructor correcto
    public DocenteInvestigador(String codigo, String nombre, int edad,
                               int horasClase, double valorHora,
                               int publicaciones, double bono) {

        super(codigo, nombre, edad, horasClase, valorHora, publicaciones);
        this.bono = bono;
    }

    @Override
    public double calcularPago() {
        // pago base del docente + bono por investigación
        return super.calcularPago() + bono;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bono investigación: $" + bono);
        System.out.println("Pago total: $" + calcularPago());
    }
}
