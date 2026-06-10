package modelo;

public class Personas {
    private String nombre;
    private  String correo;
    private int edad;

    public Personas(String nombre, String correo, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String totring(){
        return "Nombre: "+nombre+"\nCorreo: "
                +correo+"\nEdad: "+edad;
    }
}
