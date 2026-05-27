package servicio;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {

    static Scanner sc = new Scanner(System.in);
    public static String leerCedula(){

        while(true){

            try{
                System.out.print("Cedula: ");

                String cedula = sc.nextLine();
                if(cedula.trim().isEmpty()){
                    throw new Exception("Campo vacio");
                }

                // LONGITUD

                if(cedula.length() != 10){
                    throw new Exception("Debe tener 10 digitos");
                }

                // SOLO NUMEROS
                for(int i = 0; i < cedula.length(); i++){
                    char c = cedula.charAt(i);

                    if(!Character.isDigit(c)){
                        throw new Exception("Solo numeros");
                    }
                }
                return cedula;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static String leerCorreo(
            String mensaje){

        while(true){

            try{

                System.out.print(mensaje);

                String correo = sc.nextLine();

                if(correo.trim()
                        .isEmpty()){throw new Exception("Campo vacio");
                }

                // VALIDAR @

                if(!correo.contains("@")){
                    throw new Exception("Debe contener @");
                }

                // VALIDAR .

                if(!correo.contains(".")){

                    throw new Exception("Debe contener .");
                }
                return correo;

            }catch(Exception e){

                System.out.println(e.getMessage());
            }
        }
    }

    public static String leerTexto(String mensaje){
        while(true){
            try{

                System.out.print(mensaje);

                String texto = sc.nextLine();

                if(texto.trim().isEmpty()){

                    throw new Exception("Campo vacio");
                }
                return texto;
            }catch(Exception e){

                System.out.println(e.getMessage()
                );
            }
        }
    }

    // LEER ENTERO

    public static int leerEntero(String mensaje){
        while(true){

            try{
                System.out.print(mensaje);
                int numero = sc.nextInt();
                sc.nextLine();
                if(numero < 0 || numero > 120){
                    throw new Exception("Fuera de rango");
                }

                return numero;

            }catch(
                    InputMismatchException e){

                System.out.println("Solo numeros enteros");

                sc.nextLine();

            }catch(Exception e){

                System.out.println(e.getMessage());
            }
        }
    }

    // LEER DOUBLE

    public static double leerDouble(
            String mensaje){

        while(true){

            try{

                System.out.print(mensaje
                );

                double numero = sc.nextDouble();

                sc.nextLine();

                if(numero < 0){throw new Exception(
                            "Numero invalido");
                }

                return numero;

            }catch(
                    InputMismatchException e){

                System.out.println("Solo numeros");
                sc.nextLine();

            }catch(Exception e){

                System.out.println(e.getMessage());
            }
        }
    }
}
