public class Personas {
    private String cedula;
    private String nombre;
    private  int edad;

    public Personas(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setCedula(String cedula) {
        if (cedula.trim().isEmpty()){
            this.cedula = cedula;
        }else{
            System.out.println("No puede estar vacio la cedula");
        }

    }

    public void setNombre(String nombre) {
        if (nombre.trim().isEmpty()){
            this.nombre = nombre;
        }else{
            System.out.println("No puede estar vacio el nombre");
        }
    }

    public void setEdad(int edad) {
        if (edad>0 && edad<120){
            this.edad=edad;
        }else {
            System.out.println("no puede ser negatio o mayori a 120");

        }
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrar (){
        System.out.println("-----------------------------------");
        System.out.println("Cedula: "+ cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+ edad);
    }
}
