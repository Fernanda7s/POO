public class Administrador implements Autenticable,Reportable,Gestionable{
    @Override
    public boolean iniciarSesion(String usurio, String clave) {
        if (usurio.equals("Admin")&& clave.equals("123a")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Administrador gestionando sistema.");
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte general generado.");

    }
}
