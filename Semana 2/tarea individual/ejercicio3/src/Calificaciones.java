import java.util.Scanner;

public class Calificaciones {
    private String nombreEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    public Calificaciones(){

    }
    void ingresarDatos (){
        Scanner sc= new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        this.nombreEstudiante = sc.nextLine();

        System.out.print("Nota 1: ");
        this.nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        this.nota2= sc.nextDouble();

        System.out.print("Nota 3: ");
        this.nota3= sc.nextDouble();
    }
    double calculaPromedio() {
        double promedio = (nota1 + nota2 + nota3) / 3;
        return promedio;
    }

    String determinarEstado() {
        if (calculaPromedio() >=7) {
            return "Aprobado";
        }else {
            return "Reprobado";

        }

    }
    void mostraREporte(){
        System.out.println("----------REPORTE ACADEMICO-----------------");
        System.out.println("Nombre: "+nombreEstudiante);
        System.out.println("Promedio: "+calculaPromedio());
        System.out.println("Estado: "+determinarEstado());

        System.out.println("---------------------------");


    }

}
