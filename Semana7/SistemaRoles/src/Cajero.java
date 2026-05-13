public class Cajero implements Autenticable,Gestionable{
    @Override
    public boolean iniciarSesion(String usurio, String clave) {
        if (usurio.equals("Cajero")&& clave.equals("123c")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void gestionarDatos() {
        System.out.println("El cajero gestiona pagos.");
    }
}
