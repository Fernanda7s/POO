public class PagoTarjeta implements Pegable{
    @Override
    public void procesarPago(double monto) {
        if (monto>0){
            System.out.println("Pago realizado Tarjeta");
            System.out.println("Monto: "+monto);
        }else {
            System.out.println("Error----------------------- ");

        }
    }
}
