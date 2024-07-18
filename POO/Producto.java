import java.util.Scanner;

public class Producto {
    //Atributos
    int id;
    String descripcion;
    int cantidad;

    //Constructor

    public Producto(int id, String descripcion,int cantidad){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
    }

    //Metodos

    public void Agregar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad: ");
        int inputUser = entrada.nextInt();
        cantidad += inputUser;
        System.out.println("La cantidad del producto es:"+cantidad);
        
    }

    public void Quitar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad: ");
        int inputUser = entrada.nextInt();
        cantidad -= inputUser;
        System.out.println("La cantidad del producto es: "+ cantidad);
    }
    public void totalCantidad(){
        System.out.println("La cantidad del producto es de :"+ cantidad);
    }

        public static void main(String[] args) {
            Producto producto1 = new Producto(1, "Pan", 10);
            producto1.Agregar();
            producto1.Quitar();
            producto1.totalCantidad();
        }
    }


