public class Metro {
    private String nombre;
    private String cedula;
    private double saldo;

    public Metro(String nombre, String cedula, double saldo){
    this.nombre=nombre;
    this.cedula=cedula;
   this.saldo= saldo;
    }
    //para asignar o cambiar un vaor fuera de la clase
    public void setCedula(String nuevaCedula){
        if (cedula.length()==10){
            this.cedula=nuevaCedula;
            System.out.println("la cedula actualizada");
        }else{
            System.out.println("la cedula debe tener 10 caracteres");

        }
    }
    public void setSaldo(double saldo ){
        if (saldo>=0){
            this.saldo=saldo;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    void recargar(double monto){
        if (monto>0){
            saldo+=monto;
        }
    }
    void pasaje(){
        saldo-=0.45;
    }

    public void mostrarPersona(){

            System.out.println("Cedula: "+cedula);
            System.out.println("Nombre: "+nombre);
            System.out.println("Saldo: "+saldo);

        System.out.println("------------------------- ");

    }

}
