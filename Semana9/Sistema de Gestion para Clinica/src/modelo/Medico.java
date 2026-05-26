package modelo;

public class Medico extends Empleado {
    private String especialidad;
    private int numeroPacientesAtendidos;
    private double valorConsulta;

    public Medico(String cedula, String nombre, int edad, String telefono, String correo, String especialidad, int numeroPacientesAtendidos, double valorConsulta) {
        super(cedula, nombre, edad, telefono, correo);
        this.especialidad = especialidad;
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
        this.valorConsulta = valorConsulta;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNumeroPacientesAtendidos(int numeroPacientesAtendidos) {
        this.numeroPacientesAtendidos = numeroPacientesAtendidos;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    double calcularPago() {
        double pago = numeroPacientesAtendidos*valorConsulta;
        return pago;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("MEDICO_________");
    super.mostrarInformacion();
        System.out.println("Especialidad: "+ especialidad);
        System.out.println("# Pacientes atendidos: "+numeroPacientesAtendidos);
        System.out.println("Valor de cosulta: "+valorConsulta);


    }
}
