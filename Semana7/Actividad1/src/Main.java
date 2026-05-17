import  java.util.Scanner;
public class Main {
    public static void validar(String [] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese numero: ");
            double numero = sc.nextInt();
            double divison = numero/100;
            System.out.println("Resultado: "+ divison);

        }catch (ArithmeticException e){
            System.out.println("Error: no se puede dividir por cero");
        }catch (NumberFormatException e){
            System.out.println("Error: Ingresar un numero valido");

        }finally {
            System.out.println("Programa fianalizado correctamente");

        }
    }
}
