public class MonedaNoSoportadaException extends java.lang.Exception{
    public MonedaNoSoportadaException (String moneda){
        super("moneda no soportada: "+ moneda);
    }
}
