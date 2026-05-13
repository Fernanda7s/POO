public class Supervisor implements Autenticable,Reportable{
    @Override
    public boolean iniciarSesion(String usurio, String clave) {
        if (usurio.equals("Supervisor")&& clave.equals("123")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void generarReporte() {
        System.out.println("Supervisor generando reporte.");


    }
}
