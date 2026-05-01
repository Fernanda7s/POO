public abstract class PersonaAcademica {
    private String codigo;
    private String nommbre;
    private int edad;
    private int horasClase;
    private double valorHora;
    private int publicaciones;
    public PersonaAcademica(String codigo,String nommbre,int edad,int horasClase,double valorHora,int publicaciones){
        this.codigo=codigo;
        this.nommbre=nommbre;
        this.edad=edad;
        this.horasClase=horasClase;
        this.valorHora=valorHora;
        this.publicaciones=publicaciones;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Error: nombre vacío");
        } else {
            this.codigo = codigo;
        }
    }

    public void setNommbre(String nommbre) {
        if (nommbre == null || nommbre.trim().isEmpty()) {
            System.out.println("Error: codigo vacío");
        } else {
            this.nommbre = nommbre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18){
            this.edad=edad;
        }else {
            System.out.println("Error: nombre vacío");

        }
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        if (horasClase<=40 && 1>=horasClase){
            this.horasClase=horasClase;
        }else {
            System.out.println("Error: fuera de rango");

        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora>0){
            this.valorHora=valorHora;
        }else {
            System.out.println("Error: mayor a 0");

        }
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones>0){
            this.publicaciones=publicaciones;
        }else {
            System.out.println("Error: mayor a 0");

        }
    }
    abstract double calcularPago();


    void mostrarDatos(){
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+ nommbre);
        System.out.println("Edad: "+edad);
        System.out.println("HoraClase: "+ horasClase);
        System.out.println("Vaolor HOras: "+ valorHora);
        System.out.println("publicaciones : "+ publicaciones);
    }
    void describirRoll (){

    }

}
