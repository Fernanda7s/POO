public class Certificado implements Imprimible{
    private int numero=547;
    @Override
    public void imprimir() {
        System.out.println(numero +  ":Certificado ");
    }
}
