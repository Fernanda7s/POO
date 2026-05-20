public class Estudiantes extends Personas {
    private String carrera;

    public Estudiantes(String cedula, String nombre, int edad, String carrera) {
        super(cedula, nombre, edad);
        this.carrera=carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void mostrar(){
        System.out.println("----------ESTUDIANTE--------------------");

        super.mostrar();
        System.out.println("Carrera: "+carrera);
        System.out.println("-----------------------------------");

    }
}
