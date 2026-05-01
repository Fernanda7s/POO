//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudiante> lista = new ArrayList<>();

        System.out.print("¿Cuántos estudiantes desea ingresar?: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < n; i++) {

            System.out.println("\n--- Estudiante " + (i + 1) + " ---");

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Promedio: ");
            double promedio = sc.nextDouble();

            System.out.print("Matrícula: ");
            double matricula = sc.nextDouble();

            System.out.println("Tipo (1=Becado, 2=Regular): ");
            int tipo = sc.nextInt();

            Estudiante e = null;

            // 🔥 DECISIÓN (polimorfismo)
            if (tipo == 1) {
                double porcentaje = 50; // ejemplo fijo
                e = new EstudianteBecado(codigo, nombre,promedio, matricula, porcentaje) {
                    @Override
                    public double calculaPagoFinal() {
                        return 0;
                    }
                };
            } else {
                System.out.print("Número de materias: ");
                int materias = sc.nextInt();
                e = new EstudianteRegular(codigo, nombre,promedio,matricula, materias) {
                    @Override
                    public double calculaPagoFinal() {
                        return 0;
                    }
                };
            }

            lista.add(e);
            sc.nextLine(); // limpiar buffer
        }

        // 🔥 MOSTRAR RESULTADOS
        System.out.println("\n===== RESULTADOS =====");

        int i = 1;
        for (Estudiante e : lista) {
            System.out.println("Código: E00" + i);
            e.mostrarDatos();
            System.out.println("-----------");
            i++;
        }


    }
}
