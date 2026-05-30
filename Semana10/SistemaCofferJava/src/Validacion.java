import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Validacion {
    static Scanner sc = new Scanner(System.in);
    public static String leerCorreo(String mensaje ){
        while (true ){
            try {
                //crear la parte de ingresar daots
                System.out.println(mensaje);
                String texto = sc.next();
                if (texto.trim().isEmpty()){
                    throw new Exception("Campo vacio ");
                }
                if (texto.equals("@")){
                    throw new Exception("falta el @");
                }
                return texto;
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }
    public static int leerEnteros (String mensaje , int min, int max){
        while (true){
            try {
                System.out.print("\n"+mensaje);
                int numero=sc.nextInt();
                if (numero<min || numero>max){
                    throw new Exception("Fuera del rango ");
                }
                return numero;
            }catch (InputMismatchException e){
                System.out.println("Error: solo numeros");
                sc.nextLine();//limpieza de datos
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
