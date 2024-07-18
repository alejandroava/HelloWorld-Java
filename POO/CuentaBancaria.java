import java.util.Scanner;

public class CuentaBancaria {
    // Atributos
    String titular;
    int balance;

    //Constructor

    public CuentaBancaria(String titular, int balance){
        this.titular = titular;
        this.balance = balance;
    }

    //Metodos
    public void Depositar(){
      Scanner entrada = new Scanner(System.in);
      System.out.println("Ingrese el valor a depositar: ");
      int deposito = entrada.nextInt();
      balance = balance + deposito;
      System.out.println("Su balance actual es de : "+ balance);  
    }

    public void Retirar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto es el monto que desea retirar");
        int retiro = entrada.nextInt();
        if(balance < 0 && balance < retiro){
            System.out.println("Fondos insuficientes");
        }else{
            balance = balance - retiro;
            System.out.println("Fondos retirados: " + "su saldo actual es: "+ balance);
        }

    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Alejandro", 100000);
        cuenta1.Retirar();
    }

}
