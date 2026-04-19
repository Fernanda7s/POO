public class Inventario {
    private String codigo ;
    public  String nombre;
    public  String categoria;
    private  double precio;
    private int stockDisponicle;
    private int stockPermitido;

    public Inventario(String codigo, String nombre, String categoria, double precio , int stockDisponicle, int stockPermitido){
    this.codigo=codigo;
    this.nombre= nombre;
    this.categoria=categoria;
    this.precio=precio;
    this.stockDisponicle=stockDisponicle;
    this.stockPermitido=stockPermitido;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStockDisponicle() {
        return stockDisponicle;
    }

    public int getStockPermitido() {
        return stockPermitido;
    }

    void setPrecio(double precio){
        if (precio>0){
            this.precio=precio;
        }else{
            System.out.println("Error: precio inválido");
        }
    }
    void setStockDisponicle(int stockDisponicle){
        if (stockDisponicle>0){
            this.stockDisponicle = stockDisponicle;
        }else {
            System.out.println("Error: precio inválido");

        }
    }
    void setStockPermitido(int stockPermitido){
        if (stockPermitido>0){
        this.stockPermitido= stockPermitido;
        }else {
            System.out.println("Error: precio inválido");
        }

    }
    double calcular (){
        return precio * stockDisponicle;
    }

     String validaciones () {
         if (stockDisponicle < stockPermitido) {
             return ("Requiere reposicion");

         } else if (stockDisponicle == 0) {

             return ("Producto Agotado");
         } else {
             return ("Producto suficiente");
         }
     }

    public void mostrarReporte() {
        System.out.println("------ PRODUCTO ------");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio UNitario: " + precio);
        System.out.println("Stock disponible : " + stockDisponicle);
        System.out.println("Stock mínimo: " + stockPermitido);
        System.out.println("Valor inventario: " + calcular());
        System.out.println("Estado: " + validaciones());
        System.out.println("----------------------");
    }

}
