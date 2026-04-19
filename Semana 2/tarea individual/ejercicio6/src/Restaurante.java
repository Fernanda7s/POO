import java.util.Scanner;

public class Restaurante {
    // 2 Atributos Privados
    private String cliente;
    private double precio;

    // 2 Atributos Públicos (Para cumplir el requisito de tu tarea)
    public String plato;
    public int cantidad;

    public Restaurante() {
    }

    // --- GETTERS Y SETTERS (Encapsulamiento para los privados) ---
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio > 0) this.precio = precio; // Validación de seguridad
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- REGISTRO DE PEDIDO ---");

        System.out.print("Ingresa nombre cliente: ");
        this.cliente = sc.nextLine();

        System.out.print("Ingresa nombre del plato: ");
        this.plato = sc.nextLine();

        System.out.print("Ingrese el precio: ");
        this.precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad: ");
        this.cantidad = sc.nextInt();
        sc.nextLine(); // LIMPIEZA DE BUFFER: Se pone después de leer números
    }

    // Métodos de cálculo (Tu lógica estaba perfecta aquí)
    public double subtotal() {
        return precio * cantidad;
    }

    public double descuento() {
        if (subtotal() > 25) {
            return subtotal() * 0.25;
        } else {
            return 0;
        }
    }

    public double totalfinal() {
        return subtotal() - descuento();
    }

    public void mostrarReporte() {
        System.out.println("\n--------- CUENTA DEL PEDIDO ------------------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Plato: " + plato);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal());
        System.out.println("Descuento (25%): $" + descuento());
        System.out.println("Total Final: $" + totalfinal());
        System.out.println("----------------------------------------------");
    }
}

