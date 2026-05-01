public class Docente extends PersonaAcademica{
    public Docente(String codigo, int edad, int horasClase, double valorHora, int publicaciones) {
        super(codigo, nommbre, edad, horasClase, valorHora, publicaciones);
    }

    @Override
    double calcularPago() {
        return getHorasClase()+getValorHora();
    }
    @Override
    void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Calcular Pago : "+ calcularPago());
      ;

    }

}
