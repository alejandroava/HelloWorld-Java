import java.util.Scanner;

public class Libro{
    //Atributos
    String titulo;
    String autor;
    int añoPublicacion;
    boolean prestado;

    //Constructor
    public Libro(String titulo, String autor, int anoPublicacion,boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = anoPublicacion;
        this.prestado = false;
    }

    //Metodos
    public void prestarLibro(){
        if(!prestado){
            System.out.print("El libro se puede prestar");
            prestado = true;
            return;
        }
        System.out.print("El libro esta prestado");
        }

    public void devolverLibro(){
        if(prestado){
            prestado = false;
            return;
        }
    }

    public void ObtenerEstado(){
        System.out.println("El nombre del libro es: "+ titulo);
        System.out.println("El autor del libro es: "+ autor);
        System.out.println("El año de publicacion del libro es: "+ añoPublicacion);
        }

    

    public static void main(String[] args) {
        Libro libro1 = new Libro("casa del dragon","conor",2017,false);
        libro1.prestarLibro();
        libro1.devolverLibro();
        libro1.ObtenerEstado();
    }
}
