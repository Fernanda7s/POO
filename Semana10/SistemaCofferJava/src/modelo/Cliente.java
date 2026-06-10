package modelo;

public class Cliente extends Personas {
    private String codigoCliente;
    private String tipoMembresia;

    public Cliente(String nombre, String correo, int edad, String codigoCliente, String tipoMembresia) {
        super(nombre, correo, edad);
        this.codigoCliente = codigoCliente;
        this.tipoMembresia = tipoMembresia;
    }
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cliente c = (Cliente) obj;// esta parte se llama casting
        return codigoCliente.equals(c.codigoCliente);
    }
    @Override
    public int hashCode(){

        return codigoCliente.hashCode();
    }
    @Override
    public String toString() {
        return "Codigo: " + codigoCliente +
                "\nMembresia: " + tipoMembresia +
                "\nNombre: " + getNombre() +
                "\nCorreo: " + getCorreo() +
                "\nEdad: " + getEdad() +"\n____________________\n";
    }
}
