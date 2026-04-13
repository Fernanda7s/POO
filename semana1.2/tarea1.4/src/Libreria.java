public class Libreria {

    private String titulo;
    private String autor;
    private int anio;


    public Libreria( String titulo, String autor, int anio){

        this.titulo=titulo;
        this.autor= autor;
        this.anio=anio;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAnio(){
        return anio;
    }
    public String getAutor(){
        return autor;
    }
    public  void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAnio(int anio) {
        if (anio>1800&& anio<=2026){
            this.anio=anio;
        } else  {
            System.out.println("Fuera del ranfo ");
        }
    }

    void mostrarLibro(){

            System.out.println("Titulo: "+titulo);
            System.out.println("Autor: "+autor);
            System.out.println("Año: "+anio);
            System.out.println("_________________________________________");
    }
}
