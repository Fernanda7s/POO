//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Inventario i1 = new Inventario("PRD-105","Disco SSD 1TB",
                "Almacenamiento",89.5,12,8);
        i1.mostrarReporte();
        System.out.println("------CAMBIOS------");
        i1.setPrecio(95.00);
        i1.setStockDisponicle(5);
        i1.mostrarReporte();
        System.out.println("------CAMBIOS stock negativo------");
        i1.setStockDisponicle(-3);
        System.out.println("Stock diponible: "+ i1.getStockDisponicle());



    }
}