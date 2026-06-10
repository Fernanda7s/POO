package util;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Validacion {
    static Scanner sc = new Scanner(System.in);

    public static String leerCorreo(String mensaje) {
        while (true) {
            try {
                //crear la parte de ingresar daots
                System.out.println(mensaje);
                String texto = sc.next();
                if (texto.trim().isEmpty()) {
                    throw new Exception("Campo vacio ");
                }
                if (!texto.contains("@")) {
                    throw new Exception("falta el @");
                }
                return texto;
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }


    public static int leerEnteros(String mensaje, int min, int max) {
        while (true) {
            try {
                System.out.print("\n" + mensaje);
                int numero = sc.nextInt();
                if (numero < min || numero > max) {
                    throw new Exception("Fuera del rango ");
                }
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Error: solo numeros");
                sc.nextLine();//limpieza de datos
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static String leerCodigo(String mensaje){
        while (true){
            try {
                //crear la parte de ingresar daots
                System.out.println(mensaje);
                String texto = sc.nextLine();
                if (texto.trim().isEmpty()) {
                    throw new Exception("Campo vacio ");
                }
                return texto;
            }catch (Exception e){
                System.out.println(e.getMessage());

            }
        }

    }
    public static String leerTexto (String mensaje ){
        while (true){
            try {
                System.out.println(mensaje);
                String texto = sc.nextLine();
                if (texto.trim().isEmpty()) {
                    throw new Exception("Campo vacio ");
                }
                return texto;
            }catch (Exception e){
                System.out.println(e.getMessage());

            }
        }

    }

    public static double leerConsumo(String mensaje) throws Exception {
        try {
            System.out.println(mensaje);
            double valor = sc.nextDouble();
            if (valor < 0) {
                throw new Exception(" el numero es negativo");
            }
            return valor;

        } catch (InputMismatchException e) {

            sc.nextLine();
            throw new Exception("Solo se deben ingresar numeros ");
        }

    }
}
