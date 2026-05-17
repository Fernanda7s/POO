public class ValidadEdad {
    public static void validar(int edad) throws IllegalAccessError, IllegalAccessException {
        if (edad <0|| edad >150){
            throw new IllegalAccessException("Edad invalida "+ edad);
        }
        System.out.println("Edad valida "+ edad);
    }
    public static void main (String [] args){
        try{
            validar(26);
            validar(-6);
        } catch (IllegalAccessException e){
            System.err.println("Capturado:  "+ e.getMessage());
        }
    }
}
