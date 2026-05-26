package modelo;

public class Administrativo extends Empleado {
    private String departamento;
    private int horasTrabjadas;
    private  double valorHora;

    public Administrativo(String cedula,String nombre, int edad, String telefono, String correo, String departamento, int horasTrabjadas, double valorHora) {
        super(cedula, nombre, edad, telefono, correo);
        this.departamento = departamento;
        this.horasTrabjadas = horasTrabjadas;
        this.valorHora = valorHora;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setHorasTrabjadas(int horasTrabjadas) {
        this.horasTrabjadas = horasTrabjadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    double calcularPago(){
        double pago = horasTrabjadas*valorHora;
        return pago;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("ADMINISTRATIVO_________");
        super.mostrarInformacion();
        System.out.println("Departamento: "+ departamento);
        System.out.println("Horas Trabajadas: "+ horasTrabjadas);
        System.out.println("Valor por Hora: "+ valorHora);


    }
}
