public class Medico extends Empleado{
    private String especialidad;
    private int numeroPacientesAtendidos;
    private double valorConsulta;

    public Medico(String cedula, String nombre, int edad, String telefono, String correo, String especialidad, int numeroPacientesAtendidos, double valorConsulta) {
        super(cedula, nombre, edad, telefono, correo);
        this.especialidad = especialidad;
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
        this.valorConsulta = valorConsulta;
    }

    @Override
    double calcularPago() {
        double pago = numeroPacientesAtendidos*valorConsulta;
        return pago;
    }
}
