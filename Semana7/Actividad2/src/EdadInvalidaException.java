public class EdadInvalidaException extends java.lang. Exception {
    private int edadIngresada;
    public EdadInvalidaException(int edad) {

        super("Edad invalida: " + edad);

        this.edadIngresada = edad;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}
