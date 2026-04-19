public class Libros {
    //•	Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
    //•	Crear un constructor.
    //•	Crear un método mostrarInformacion() que imprima los datos del libro.
    //•	Crear 2 objetos de tipo Libro y mostrar su información.
    String titulo;
    String autor;
    int aniPublicacion;

    public Libros(String titulo, String autor, int aniPublicacion){
        this.titulo=titulo;
        this.autor= autor;
        this.aniPublicacion= aniPublicacion;
    }
    void mostrarDatos (){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Añio: "+ aniPublicacion);
        System.out.println("__________________________________________ ");

    }

}
