public abstract class Dron {
    private String codigo;
    private String modelo;
    private double distanciaKm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;
    public Dron(){};

    public Dron(String codigo,String modelo, double distanciaKm, double pesoPaquete,double horasVuelo,double costoBase){
        this.codigo=codigo;
        this.modelo=modelo;
        this.distanciaKm=distanciaKm;
        this.pesoPaquete=pesoPaquete;
        this.horasVuelo=horasVuelo;
        this.costoBase=costoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (!codigo.trim().isEmpty()) {

            this.codigo = codigo;

        } else {

            System.out.println("ERROR: codigo vacio");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (!modelo.trim().isEmpty()) {

            this.modelo = modelo;

        } else {

            System.out.println("ERROR: modelo vacio");
        }
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {

        if (distanciaKm > 0) {

            this.distanciaKm = distanciaKm;

        } else {

            System.out.println("ERROR: distancia invalida");
        }
    }

    public double getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(double pesoPaquete) {
        if (pesoPaquete > 0) {

            this.pesoPaquete = pesoPaquete;

        } else {

            System.out.println("ERROR: peso invalido");
        }
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(double horasVuelo) {

        if (horasVuelo > 0) {

            this.horasVuelo = horasVuelo;

        } else {

            System.out.println("ERROR: horas invalidas");
        }
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    abstract double calcularCostoEntrega();
    abstract boolean validarDatos();
    public void  mostrarInformacion(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Distancia (km): " + distanciaKm);
        System.out.println("Peso paquete (kg): " + pesoPaquete);
        System.out.println("Horas de vuelo: " + horasVuelo);
        System.out.println("Costo base: " + costoBase);
    }
}
