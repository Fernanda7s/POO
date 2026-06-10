package interfaces;

public interface CrudPedido {
    void registrarPedido(String correo, double consumo);
    void actulizarPediso (String correo,double nuevoConsumo);
    void eliminarPedido(String correo);
    public double promedioConsumo ();
    public void mejorCliente();
}
