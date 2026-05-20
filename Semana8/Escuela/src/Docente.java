public class Docente extends Personas{
    private  String asignatura;

    public Docente(String cedula, String nombre, int edad, String asignatura) {
        super(cedula, nombre, edad);
        this.asignatura=asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public void mostrar(){
        System.out.println("-----------DOCENTE ----------------");

        super.mostrar();
        System.out.println("Asignatura: "+asignatura);
        System.out.println("-----------------------------------");

    }
}
