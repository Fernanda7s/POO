package util;

import modelo.Administrativo;
import modelo.Empleado;
import modelo.Medico;

import  java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoServicio {
    private ArrayList<Medico> medicos;
    private ArrayList<Administrativo> administrativos;
    private ArrayList<Empleado>empleados;
    private Scanner sc;

    // constructor de la clase gestor
    public EmpleadoServicio(){
        medicos = new ArrayList<>();
        administrativos= new ArrayList<>();
        empleados= new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void registrarMedico (){
        System.out.println("__________REGISTRAR MEDICO____________________");
       try {
           System.out.print("Cedula:");
           String cedula=sc.next();
           System.out.print("Nombre:");
           String nombre = sc.nextLine();
           System.out.print("Edad:");
           int edad = sc.nextInt();
           System.out.print("Telefono:");
           String telefono =sc.next();
           System.out.print("Correo:");
           String correo = sc.next();
           System.out.print("Especialidad:");
           String especialidad = sc.nextLine();
           System.out.print("Numeros pacientes antendidos:");
           int numeroPaciente=sc.nextInt();
           System.out.print("Valor de consulta $:");
           double consulta=sc.nextDouble();
           //agregar a un objeto
           Medico m = new Medico(cedula,nombre,edad,telefono,correo,especialidad,numeroPaciente,consulta);
           //guardar en un arreglo
           medicos.add(m);
       }catch (IllegalArgumentException e){
           System.out.println("Error de validacion: "+e.getMessage());
       }

    }

    public void registrarAdministrativos(){
        System.out.println("__________REGISTRAR ADMINISTRATIVO____________________");
        try {
            System.out.print("Cedula:");
            String cedula=sc.next();
            System.out.print("Nombre:");
            String nombre = sc.nextLine();
            System.out.print("Edad:");
            int edad = sc.nextInt();
            System.out.print("Telefono:");
            String telefono =sc.next();
            System.out.print("Correo:");
            String correo = sc.next();
            System.out.print("Departamento:");
            String departamento = sc.nextLine();
            System.out.print("Horas Trabajadas:");
            int horasTrabjadas=sc.nextInt();
            System.out.print("Valor por hora $:");
            double valorHora=sc.nextDouble();
            //agregar a un objeto
            Administrativo a = new Administrativo(cedula,nombre,edad,telefono,correo,departamento,horasTrabjadas,valorHora);
            //guardar en un arreglo
            administrativos.add(a);

        }catch (IllegalArgumentException e){
            System.out.println("Error de validacion: "+e.getMessage());
        }
    }
    public void mostrarEmpleado(){
        System.out.println("__________MOSTRAR EMPLEADOS____________________");

        if (empleados.isEmpty()){
            System.out.println("No hay jugadores registrados ");
            return;
        }
        for (Empleado e : empleados){
            e.mostrarInformacion();
            System.out.println("─────────────────────");

        }

    }
    public Empleado buscarCedula() throws Exception {
        System.out.println("__________BUSCAR POR CEDULA ____________________");
        try {
            System.out.print("Cedula:");
            String cedula=sc.next();
            boolean encontrado = false;
            for (Empleado e: empleados){
                if (e.getCedula().equals(cedula)){
                    e.mostrarInformacion();
                    encontrado= true;
                }
            }
            if (!encontrado){
                throw  new Exception("Cedula no encotrada");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void reemplazrInformacion () throws Exception {
        System.out.println("__________ACTUALIZAR INFORMACION ____________________");

        try {
           ;
            System.out.print("Ingrese cedula: ");
            String cedula = sc.next();
           Empleado e = buscarCedula();
           if (e instanceof Medico){
               Medico m = (Medico) e;
               System.out.print("Nueva Especialidad: ");
               String newEspecialidad = sc.nextLine();
               m.setEspecialidad(newEspecialidad);
               System.out.println("# nuevo Pacientes atendidos: ");
               int pacientes=sc.nextInt();
               m.setNumeroPacientesAtendidos(pacientes);
               System.out.println("nuevo Valor de cosulta: ");
               double newValor= sc.nextDouble();
               m.setValorConsulta(newValor);
           } else if (e instanceof  Administrativo) {
               Administrativo a = (Administrativo) e;
               System.out.print("nuevo Departamento: ");
               String newDepartamento = sc.nextLine();
               a.setDepartamento(newDepartamento);
               System.out.print("nuevo horas Trabjadas: ");
               int newHoras = sc.nextInt();
               a.setHorasTrabjadas(newHoras);
               System.out.print("nuevo Valor por Hora: ");
                double newValor= sc.nextDouble();
                a.setValorHora(newValor);
           }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void eliminarRegistro() throws Exception {
        System.out.println("__________ELIMINAR INFORMACION ____________________");
        try{
            System.out.print("Ingrese cedula: ");
            String cedula = sc.next();
            Empleado e = buscarCedula();
            empleados.remove(e);
            System.out.println("✅ Jugador '" + e.getNombre() + "' eliminado.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void calcularPagos() {
        System.out.println("__________CALCULAR PAGOS ____________________");
        try {
            System.out.print("Ingrese cedula: ");
            String cedula = sc.next();
            Empleado e = buscarCedula();
            if (e instanceof Medico) {
                Medico m = (Medico) e;
                calcularPagos();
            } else if (e instanceof Administrativo) {
                Administrativo a = (Administrativo) e;
                calcularPagos();
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

        public void mostrarEstadisticas(){
        System.out.println("__________CALCULAR PAGOS ____________________");
        int contarMedicos=0;
        int contarEmpleados=empleados.size();
        int contarAdministrativo=0;
        double pagoMedico=0;
        double pagoAdministracion=0;
        Empleado mayor = empleados.get(0);


        for (Empleado e :empleados){
            if (e instanceof Medico){
                contarMedicos ++;
                pagoMedico+=e.calcularPago();
            } else if (e instanceof Administrativo) {
                contarAdministrativo++;
                pagoAdministracion=e.calcularPago();

            }
            if(e.calcularPago() > mayor.calcularPago()){
                mayor = e;
            }
        }

            System.out.println("Total empleados: "+ contarEmpleados);

            System.out.println("Total medicos: " + contarMedicos);

            System.out.println("Total administrativos: " + contarAdministrativo);
            System.out.println("Total pago Medicos $: " + pagoMedico);
            System.out.println("Total administrativos: " + pagoAdministracion);
            System.out.println("Empleado con mayor ingreso:");
            mayor.mostrarInformacion();


    }
}
