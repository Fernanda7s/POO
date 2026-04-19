import java.util.Scanner;

public class Estudiante {
    public String nombre;
    public String carrera;
    public int edad;

    public Estudiante(){

    }

    void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingres nombre: ");
        this.nombre= sc.nextLine();
        System.out.print("ingres carrera: ");
        this.carrera= sc.nextLine();
        System.out.print("ingres edad: ");
        this.edad = sc.nextInt();
    }
    void mostrarDatos (){
        System.out.println("---------DATOS DEL ESTUDIANTE ---------");
        System.out.println("Nombre:"+ nombre);
        System.out.println("Carrera:"+ carrera);
        System.out.println("Edad:"+ edad);

    }

}
