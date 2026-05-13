public class ActaNotas implements Imprimible{
    private String curso="Octavo A";
    @Override
    public void imprimir() {
        System.out.println("Actas de notas: "+ curso);

    }
}
