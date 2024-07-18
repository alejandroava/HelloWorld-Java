import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    // Atributos
    private String nombre;
    private ArrayList<Integer> calificaciones;

    // Constructor
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    // Método para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0; // Retorna 0 si no hay calificaciones
        }

        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        return (double) suma / calificaciones.size();
    }

    // Método para añadir nuevas calificaciones a la lista
    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante(nombre);

        // Solicitar y agregar calificaciones hasta que el usuario decida parar
        while (true) {
            System.out.print("Ingrese una calificación o -1 para terminar: ");
            int calificacion = scanner.nextInt();
            
            if (calificacion == -1) {
                break; // Terminar el bucle si se ingresa -1
            }
            
            estudiante.agregarCalificacion(calificacion);
        }

        // Calcular y mostrar el promedio de las calificaciones
        double promedio = estudiante.calcularPromedio();
        System.out.println("Promedio de calificaciones: " + promedio);

        scanner.close();
    }
}