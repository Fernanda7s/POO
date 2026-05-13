public class Trasferencia implements Pegable{
    @Override
    public void procesarPago(double monto) {
        if (monto>0){
            System.out.println("Pago realizado con transferencia");
            System.out.println("Monto: "+monto);
        }else {
            System.out.println("Error----------------------- ");

        }
    }
}
