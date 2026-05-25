import  java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    private ArrayList<Medico> medicos;
    private ArrayList<Administrativo> administrativos;
    private Scanner sc;

    // constructor de la clase gestor
    public Crud(){
        medicos = new ArrayList<>();
        administrativos= new ArrayList<>();
        sc = new Scanner(System.in);
    }

}
