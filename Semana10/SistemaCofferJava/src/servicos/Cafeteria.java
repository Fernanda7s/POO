package servicos;

import interfaces.CrudPedido;
import modelo.Cliente;
import modelo.Personas;
import util.Validacion;


import java.rmi.registry.LocateRegistry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Cafeteria implements CrudPedido {
    private String nombreCafeteria;
    private HashMap<String, Double> mapaPedidos;

    //uso hashmap y hasset
    private HashMap<String, Cliente> clientes;
    private HashMap<String, Personas> personas;



    public Cafeteria(String nombreCafeteria) {
        this.nombreCafeteria = nombreCafeteria;
        clientes = new HashMap<>();
        mapaPedidos = new HashMap<>();
        personas = new HashMap<>();

    }

    @Override
    public void registrarPedido(String correo, double consumo) {
        try {
             correo = Validacion.leerCorreo("ingrese correo: ");
            consumo = Validacion.leerConsumo("ingrese consumo: ");
            // para guardar
            mapaPedidos.put(correo, consumo);
            System.out.println(
                    "Pedido registrado"
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void actulizarPediso(String correo, double nuevoConsumo) {
        try {
            correo = Validacion.leerCorreo("ingrese correo: ");
            if (!mapaPedidos.containsKey(correo)) {
                throw new Exception("Pedido no encontrado");
            }
            nuevoConsumo = Validacion.leerConsumo("Ingrese nuevo consumo: ");

            mapaPedidos.put(correo, nuevoConsumo);
            System.out.println("Pedido actualizado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarPedido(String correo) {
        try {
            System.out.println(mapaPedidos);

            correo = Validacion.leerCorreo("ingrese correo: ");
            System.out.println("Buscando: " + correo);
            if (!mapaPedidos.containsKey(correo)) {
                throw new Exception("Pedido no encontrado");
            }
            mapaPedidos.remove(correo);
            System.out.println("Pedido eliminado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public double promedioConsumo() {
        if (mapaPedidos.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double consumo : mapaPedidos.values()) {
            suma += consumo;
        }
        return suma / mapaPedidos.size();
    }

    @Override
    public void mejorCliente() {
        if (mapaPedidos.isEmpty()) {
            System.out.println("Esta vacio");
            return;
        }
        String correrMayor = " ";
        double mayor = 0;
        for (Map.Entry<String, Double> pedido : mapaPedidos.entrySet()) {
            if (pedido.getValue() > mayor) {
                mayor = pedido.getValue();
                correrMayor = pedido.getKey();
            }
        }
        System.out.println("Correo: " + correrMayor);

        System.out.println("Consumo: " + mayor);
    }
    public void registrarCliente() {

        try {

            String codigo = Validacion.leerCodigo("Ingrese codigo: ");

            if (clientes.containsKey(codigo)) {
                throw new Exception("El codigo ya existe");
            }

            String membresia = Validacion.leerTexto("Ingrese membresia: ");

            String nombre = Validacion.leerTexto("Ingrese nombre: ");

            String correo = Validacion.leerCorreo("Ingrese correo: ");

            int edad = Validacion.leerEnteros("Ingrese edad: ",0,120);

            Cliente cliente = new Cliente(nombre, correo, edad, codigo, membresia);
            clientes.put(codigo, cliente);
            System.out.println("Cliente registrado");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }


public void mostrarClientes() {

    if (clientes.isEmpty()) {
        System.out.println("No existen clientes");
        return;
    }

    for (Cliente c : clientes.values()) {
        System.out.println(c);
    }
}



public void buscarCliente() {

    try {

        String codigo = Validacion.leerCodigo("Ingrese codigo: ");

        Cliente cliente = clientes.get(codigo);

        if (cliente == null) {

            throw new Exception("Cliente no encontrado");
        }

        System.out.println(cliente);

    } catch (Exception e) {

        System.out.println(e.getMessage());
    }
}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Double> pedido : mapaPedidos.entrySet()) {
            sb.append(pedido.getKey()).append(" -> ").append(pedido.getValue()).append("\n");
        }

        return sb.toString();
    }
};
