import java.util.Scanner;

public class Empleado {
    String nombre;
    String posicion;
    double salario;
    int id;

    //Constructor
    public Empleado(String nombre,String posicion, double salario,int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id =id;
    }

    public void ObtenerDatos(){
        System.out.println("El nombre del empleado es: "+ nombre);
        System.out.println("El puesto del empleado es: "+ posicion);
        System.out.println("El Salario del empleado es: "+ salario);
        System.out.println("El Id del empleado es: "+ id);
    }

    public void AumentarSalario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es el porcentaje a subir");
        double aumento = entrada.nextDouble();
        double nuevoSalario = salario * aumento / 100;
        System.out.println("El nuevo salario del empleado es: "+ nuevoSalario); 
    }
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Alejandro","programador",3000000,1152206925);

        empleado1.ObtenerDatos();
        empleado1.AumentarSalario();
    }
}
