import java.util.Scanner;

public class Producto {
    private String nombreProducto;
    private double precio;
    private int cantidad;

    public Producto(){

    }
    void ingresarDatos(){
        System.out.println("---------------------------");
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingresa nombre de producto: ");
        this.nombreProducto=sc.nextLine();
        System.out.print("Ingrese la Cantidad: ");
        this.cantidad= sc.nextInt();
        System.out.print("Ingrese el precio: ");
        this.precio=sc.nextDouble();
    }
    void mostraFactura(){
        System.out.println("---------------------------");
        System.out.println("Producto: "+nombreProducto);
        System.out.println("Precio Unitario: "+precio);
        System.out.println("Cantidad: "+cantidad);

        System.out.println(" ");
        System.out.println("Total a pagar : "+ (precio * cantidad));

        System.out.println("---------------------------");


    }
}
