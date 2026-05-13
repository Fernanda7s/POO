public class PagoEfectivo implements Pegable{


    @Override
    public void procesarPago(double monto) {
        if (monto>0){
            System.out.println("Pago realizado en Efectivo");
            System.out.println("Monto: "+monto);
        }else {
            System.out.println("Error----------------------- ");

        }
    }
}
