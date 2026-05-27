package util;

import modelo.Administrativo;
import modelo.Empleado;
import modelo.Medico;
import servicio.Validador;

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
           String cedula=Validador.leerCedula();
           String nombre = Validador.leerTexto("Nombre: ");
           int edad = Validador.leerEntero("Edad");

           System.out.print("Telefono:");
           String telefono =sc.next();
           System.out.print("Correo:");
           String correo = sc.next();
           String especialidad = Validador.leerTexto("Especialidad: ");
           int numeroPaciente=Validador.leerEntero("Numeros pacientes antendidos:");

           double consulta=Validador.leerDouble("Valor de consulta $:");
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
            String cedula=Validador.leerCedula();
            String nombre = Validador.leerTexto("Nombre: ");
            int edad = Validador.leerEntero("Edad");

            System.out.print("Telefono:");
            String telefono =sc.next();
            System.out.print("Correo:");
            String correo = sc.next();
            String departamento = Validador.leerTexto("Departamento: ");
            int horasTrabjadas=Validador.leerEntero("Horas trabjadas:");
            double valorHora=Validador.leerDouble("Valor por horaa $:");
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
            String cedula=Validador.leerCedula();
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
            String cedula = Validador.leerCedula();
           Empleado e = buscarCedula();
           if (e instanceof Medico){
               Medico m = (Medico) e;
               String newEspecialidad = Validador.leerTexto("nueva Especialidad: ");
              ;
               m.setEspecialidad(newEspecialidad);

               int pacientes=Validador.leerEntero("# nuevo Pacientes atendidos:");
               m.setNumeroPacientesAtendidos(pacientes);

               double newValor= Validador.leerDouble("nuevo Valor de consulta $:");
               m.setValorConsulta(newValor);
           } else if (e instanceof  Administrativo) {
               Administrativo a = (Administrativo) e;
               String newDepartamento = Validador.leerTexto("nuevo departamento: ");

               a.setDepartamento(newDepartamento);

               int newHoras = Validador.leerEntero("# nuevo horas trabajadass:");

               a.setHorasTrabjadas(newHoras);

                double newValor= Validador.leerDouble("nuevo Valor por hora $:");
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
            String cedula = Validador.leerCedula();;
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
            String cedula = Validador.leerCedula();
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
