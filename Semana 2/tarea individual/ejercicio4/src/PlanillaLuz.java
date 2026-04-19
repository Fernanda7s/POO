import java.util.Scanner;

public class PlanillaLuz {
    private String nombreCliente;
    private  double consumo;
    private double costo;
    public PlanillaLuz(){

    }
    void ingresarDAtos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.print("Ingresa nombre: ");
        this.nombreCliente= sc.nextLine();
        System.out.print("Consumo: ");
        this.consumo=sc.nextDouble();
        System.out.print("Costo por kW: ");
        this.costo=sc.nextDouble();

    }
    double subtotal (){
        double calcular = consumo*costo;
        return  calcular;
    }
    double iva (){
        double calcular= (subtotal()*0.15) ;
        return  ((int)(calcular * 100)) / 100.0;

    }
    double total (){
        return subtotal()+ iva();
    }
    void  mostrarDatos (){
        System.out.println("---------REPORTE DE EMPLEADO-------------");
        System.out.println("Nombre: "+nombreCliente);
        System.out.println("Subtotal: "+subtotal());
        System.out.println("IVA: "+iva());
        System.out.println("Total a pagar : "+ total());

        System.out.println("---------------------------");
    }
}
