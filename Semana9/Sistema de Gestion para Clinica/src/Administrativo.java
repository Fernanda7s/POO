public class Administrativo extends Empleado{
    private String departamento;
    private int horasTrabjadas;
    private  double valorHora;

    public Administrativo(String cedula, String nombre, int edad, String telefono, String correo, String departamento, int horasTrabjadas, double valorHora) {
        super(cedula, nombre, edad, telefono, correo);
        this.departamento = departamento;
        this.horasTrabjadas = horasTrabjadas;
        this.valorHora = valorHora;
    }
    @Override
    double calcularPago(){
        double pago = horasTrabjadas*valorHora;
        return pago;
    }
}
