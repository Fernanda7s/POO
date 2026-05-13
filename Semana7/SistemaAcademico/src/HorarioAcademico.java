public class HorarioAcademico implements Imprimible{
    private String periodo="2026-A";
    @Override
    public void imprimir() {
        System.out.println("Horario Academico "+ periodo);
    }
}
