//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//9.	En la clase principal (Main):
//-	Crear un objeto de tipo CuentaBancaria.
//-	Llamar a los tres métodos en orden lógico.
//-	Mostrar cómo se reutiliza la información del objeto en cada acción.
        CuentaBancaria cb= new CuentaBancaria("Juana",500);
        cb.mostrarInformacion();
        cb.depositar(100);
        cb.retiro(5);
        cb.mostrarInformacion();
    }
}