import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int  horasTrabajadas;
    private double pagoHora;

    public Empleado (){

    }
    void ingresoDatos (){
        System.out.println("---------------------------");
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingresa nombre: ");
        this.nombre=sc.nextLine();
        System.out.print("Ingrese la Horas trabajadas: ");
        this.horasTrabajadas= sc.nextInt();
        System.out.print("Ingrese el precio: ");
        this.pagoHora=sc.nextDouble();
    }
    double sueldo (){
        return horasTrabajadas*pagoHora;
    }
    double bono (){
        return Math.round(sueldo()*0.0416) ;
    }
    double sueldoFinal (){
        return sueldo()+ bono();
    }
    void mostraReporte(){
        System.out.println("---------REPORTE EMPLEADO------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo Base: "+sueldo());
        System.out.println("Bono: "+bono());
        System.out.println(" Sueldo Fianl: "+ sueldoFinal());
        System.out.println("--------------------------------------------" );

        System.out.println("---------------------------");


    }
}
