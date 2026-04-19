//6.	Crear la clase CuentaBancaria con los siguientes atributos privados:
//-	nombreTitular (String)
//-	saldo (double)


public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;
    //7.	Crear un constructor público que permita inicializar los datos del titular y el saldo inicial.
    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }
    //8.	Implementar los siguientes métodos propios públicos:
//-	mostrarInformacion(): Muestra el nombre del titular y el saldo actual.
    void mostrarInformacion(){
        System.out.println("Nombre: "+nombreTitular);
        System.out.println("Salso: "+saldo);
        System.out.println("__________________");

    }
    //-	depositar(double monto): Aumenta el saldo.
    void depositar (double monto ){
    saldo= saldo+monto;
    };
    //-	retirar(double monto): Disminuye el saldo si hay suficiente dinero.
    void retiro(double monto){
    saldo = saldo-monto;
    if (saldo==0){
        System.out.println("No tiene dinero");
    }

    }
}
