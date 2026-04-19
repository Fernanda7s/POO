//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libros l1= new Libros("Ensayo a la cegera","Jose Saramango",1990);
        Libros l2= new Libros("Cruces sobre el agua","Joaquin Gallegos",1949);

        l1.mostrarDatos();
        l2.mostrarDatos();
    }
}