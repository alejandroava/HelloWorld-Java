import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;

public class fundamentos {
    public static void main(String[] args) {
        /*Ejercicio 1: Calculadora Básica
Escribe un programa que pida al usuario dos números y luego muestre el resultado de sumar, restar,
multiplicar y dividir esos números. Utiliza tipos de datos primitivos para almacenar los números y
los resultados.
*/
// Scanner entrada = new Scanner(System.in);
// float num1,num2,sumar,restar,multiplicar,dividir;
// System.out.println("Ingrese dos numeros: ");
// num1 = entrada.nextFloat();
// num2 = entrada.nextFloat();
// System.out.println("La suma es: "+(num1+num2));
// System.out.println("La resta es: "+(num1-num2));
// System.out.println("La multiplicacion es: "+(num1*num2));
// System.out.println("La division es: "+(num1/num2));

// entrada.close();


/*Ejercicio 2: Verificador de Edad
Crea un programa que solicite la edad del usuario y determine si es mayor de edad (18 años o más).
El programa debe imprimir un mensaje indicando si el usuario es mayor de edad o no.*/

// Scanner entrada = new Scanner(System.in);
// int edad;
// System.out.println("Ingrese su edad: ");
// edad = entrada.nextInt();
// if (edad>=18) {
//     System.out.println("Es mayor de edad");
// }else {
//     System.out.println("Es menor de edad");
// }
// entrada.close();

/*Ejercicio 3: Conversor de Unidades
Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al usuario que
introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
Utiliza el hecho de que una milla es igual a 1.60934 kilómetros.*/

// float millas = 1.60934f;
// Scanner entrada = new Scanner(System.in);
// float kilometros;
// System.out.println("Ingrese los kilometros para transformar a millas: ");
// kilometros = entrada.nextFloat();
// System.out.println("La distancia en millas es: "+(kilometros*millas));
// entrada.close();

/*Ejercicio 4: Calculadora de Índice de Masa Corporal (IMC)
Escribe un programa que calcule el índice de masa corporal (IMC) de una persona. El programa
debe pedir al usuario su peso en kilogramos y su altura en metros, calcular el IMC y mostrar un
mensaje con el resultado. La fórmula para calcular el IMC es peso / (altura * altura).*/

// System.out.println("---Calculadora de indice de masa corporal---");
// float kilogramos,altura,imc;
// Scanner entrada = new Scanner(System.in);
// System.out.println("Ingrese su peso en kilogramos: ");
// kilogramos = entrada.nextFloat();
// System.out.println("Ingrese su altura en metros: ");
// altura = entrada.nextFloat();
// imc = kilogramos / (altura*altura);
// System.out.println("Su indice de masa corporal es: "+imc);
// entrada.close();

/*Ejercicio 5: Clasificador de Números
Crea un programa que solicite al usuario un número y muestre un mensaje indicando si el número
es positivo, negativo o cero. Además, indica si el número es par o impar.*/

// float numero;
// Scanner entrada = new Scanner(System.in);
// System.out.println("Ingrese un numero: ");
// numero = entrada.nextFloat();
// if (numero>0 && numero % 2 == 0) {
//     System.out.println("El numero es positivo y es par");
// }else if (numero>0 && numero % 2 != 0){
//     System.out.println("El numero es positivo y es impar");
// }else if(numero<0 && numero % 2 == 0){
//     System.out.println("El numero es negativo y es par");
// }else if(numero<0 && numero % 2 !=0 ){
//     System.out.println("El numero es negativo y es impar");
// }else if(numero == 0){
//     System.out.println("El numero es cero");
// }
// entrada.close();

/*Ejercicio 6: Calculadora de Días del Mes
Desarrolla un programa que pida al usuario el número de un mes (1-12) y muestre el número de días
de ese mes. Asume que febrero tiene 28 días. Utiliza una estructura switch para resolverlo.*/

// int mes;
// Scanner entrada = new Scanner(System.in);
// System.out.println("Ingrese el numero del mes: ");
// mes = entrada.nextInt();
// switch (mes) {
//     case 1:
//         System.out.println("Enero tiene 31 dias");
//         break;
//     case 2:
//         System.out.println("Febrero tiene 28 dias");
//         break;
//     case 3:
//         System.out.println("Marzo tiene 31 dias");
//         break;
//     case 4:
//         System.out.println("Abril tiene 30 dias");
//         break;
//     case 5:
//         System.out.println("Mayo tiene 31 dias");
//         break;
//     case 6:
//         System.out.println("Junio tiene 30 dias");
//         break;
//     case 7:
//         System.out.println("Julio tiene 31 dias");
//         break;
//     case 8:
//         System.out.println("Agosto tiene 31 dias");
//         break;
//     case 9:
//         System.out.println("Septiembre tiene 30 dias");
//         break;
//     case 10:
//         System.out.println("Octubre tiene 31 dias");
//         break;
//     case 11:
//         System.out.println("Noviembre tiene 30 dias");
//         break;
//     case 12:
//         System.out.println("Diciembre tiene 31 dias");
//         break;
//         default:
//             System.out.println("El mes no existe");
// }
//  entrada.close();

/*Ejercicio 7: Menú Interactivo
Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones
matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una
opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar
la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones
del menú.*/

//int opcion;
//Scanner entrada = new Scanner(System.in);
//System.out.println("Ingrese una opcion:1.Sumar2.Restar3.Multiplicar4.Dividir5.Salir");
//float num1,num2,resultado;
//opcion = entrada.nextInt();
//switch (opcion) {
//    case 1:
//
//        System.out.println("Ingrese el primer numero:");
//        num1 = entrada.nextFloat();
//        System.out.println("Ingrese el segundo numero:");
//        num2 = entrada.nextFloat();
//        resultado = num1 + num2;
//        System.out.println("La suma es: " + resultado);
//        break;
//    case 2:
//
//        System.out.println("Ingrese el primer numero:");
//        num1 = entrada.nextFloat();
//        System.out.println("Ingrese el segundo numero:");
//        num2 = entrada.nextFloat();
//        resultado = num1 - num2;
//        System.out.println("La resta es: " + resultado);
//        break;
//    case 3:
//
//        System.out.println("Ingrese el primer numero:");
//        num1 = entrada.nextFloat();
//        System.out.println("Ingrese el segundo numero:");
//        num2 = entrada.nextFloat();
//        resultado = num1 * num2;
//        System.out.println("La multiplicacion es: " + resultado);
//        break;
//    case 4:
//
//        System.out.println("Ingrese el primer numero:");
//        num1 = entrada.nextFloat();
//        System.out.println("Ingrese el segundo numero:");
//        num2 = entrada.nextFloat();
//        resultado = num1 / num2;
//        System.out.println("La division es: " + resultado);
//        break;
//    case 5:
//        break;
//        default:
//            System.out.println("Opcion no valida");
//
//    }
//    entrada.close();

/*Ejercicio 8: Cálculo de Promedio
Escribe un programa que solicite al usuario ingresar tres calificaciones, calcule el promedio y
muestre un mensaje indicando si el alumno aprueba o no (considera que se aprueba con un
promedio de 6 o más).*/
//     float calificacion1,calificacion2,calificacion3,promedio;
//     Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese las calificaciones del estudiante");
//        calificacion1 = entrada.nextFloat();
//        calificacion2 = entrada.nextFloat();
//        calificacion3 = entrada.nextFloat();
//        promedio = (calificacion1 + calificacion2 + calificacion3)/3;
//        if(promedio >= 6){
//            System.out.println("La calificcacion del estudiante es: "+ promedio + ", el estudiante aprobo");
//        }else{
//            System.out.println("La calificacion del estudiante es de:"+ promedio+ " El estudiante no paso");
//        }
//        entrada.close();

        /*Ejercicio 9: Calculadora de Año Bisiesto
Escribe un programa que le pida al usuario que ingrese un año y determine si es un año bisiesto o
no. Recuerda que un año es bisiesto si es divisible entre 4, excepto aquellos que son divisibles entre
100, a menos que también sean divisibles entre 400.*/

//        int year;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese un año para comprobar si es bisiesto");
//        year = entrada.nextInt();
//        if(year % 4 == 0 || year % 400 == 0){
//            System.out.println("El año es bisiesto");
//        }else {
//            System.out.println("El año no es bisiesto");
//        }
//        entrada.close();

        /*Ejercicio 10: Calculadora de Propina
Desarrolla un programa que calcule cuánto dejar de propina en un restaurante. El usuario debe
ingresar el total de la cuenta y el porcentaje de propina que desea dejar. El programa debe mostrar
cuánto dinero en propina debe dejar.*/

//        float propina,cuenta,porcentaje;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese el total de la cuenta: ");
//        cuenta = entrada.nextFloat();
//        System.out.println("Ingrese el porcentaje de la propina que desea dejar: ");
//        porcentaje = entrada.nextFloat();
//        propina =(cuenta/ 100)* porcentaje;
//        System.out.println("La propina es: "+ propina);
//        entrada.close();

        /*Crea un programa que solicite al usuario ingresar tres números enteros y luego los muestre
        ordenados de menor a mayor. Intenta resolverlo primero con if y else, y luego intenta crear una
        solución usando el operador ternario para práctica adicional.*/

//        int num1,num2,num3;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese tres numeros: ");
//        num1 = entrada.nextInt();
//        num2 = entrada.nextInt();
//        num3 = entrada.nextInt();
//
//        int menor,medio,mayor;
//
//        if(num1 < num2 && num1 < num3){
//            menor = num1;
//            if(num2 < num3){
//                medio = num2;
//                mayor = num3;
//                System.out.println("El orden de los numeros es : "+ menor +" " + medio +" "+ mayor);
//            }else {
//                medio = num3;
//                mayor = num2;
//                System.out.println("El orden de los numeros es : "+ menor +" " + medio +" "+ mayor);
//            };
//        }else if(num2 < num1 && num2 < num3){
//            menor = num2;
//            if(num1 < num3){
//                medio = num1;
//                mayor = num3;
//                System.out.println("El orden de los numeros es : "+ menor +" " + medio +" "+ mayor);
//            }else{
//                medio = num3;
//                mayor = num1;
//                System.out.println("El orden de los numeros es : "+ menor +" " + medio +" "+ mayor);
//            }
//        }else if(num3 < num2 && num3 < num1){
//            menor = num3;
//            if(num2 < num1){
//                medio=num2;
//                mayor=num1;
//                System.out.println("El orden de los numeros es : "+ menor +" " + medio +" "+ mayor);
//            }else{
//                medio=num1;
//                mayor=num2;
//                System.out.println("El orden de los numeros es : "+ menor +" " + medio +" "+ mayor);
//            }
//        }
//        entrada.close();

        /*Ejercicio 12: Generador de Horóscopo
Implementa un programa que le pida al usuario su mes y día de nacimiento. Luego, basado en esa
información, muestra su signo del zodíaco. Utiliza una estructura switch para manejar los meses y if
para los días.*/

//        int mes,dia;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese su mes de nacimiento: ");
//        mes = entrada.nextInt();
//        System.out.println("Ingrese su dia de nacimiento");
//        dia = entrada.nextInt();
//
//        switch (mes){
//            case 1:
//                if(dia >= 20){
//                    System.out.println("su signo es Acuario");
//                }else{
//                    System.out.println("su signo es capricornio");
//                }
//            case 2:
//                if(dia >= 19){
//                    System.out.println("su signo es piscis");
//                }else{
//                    System.out.println("su signo es aries");
//                }
//            case 3:
//                if(dia>=21){
//                    System.out.println("su signo es aries");
//                }else{
//                    System.out.println("su signo es piscis");
//                }
//            case 4:
//                if(dia >= 20){
//                    System.out.println("su signo es tauro");
//                }else{
//                    System.out.println("su signo es aries");
//                }
//            case 5:
//                if(dia >= 21){
//                    System.out.println("su signo es geminis");
//                }else{
//                    System.out.println("su signo es tauro");
//                }
//            case 6:
//                if(dia >= 21){
//                    System.out.println("su signo es cancer");
//                }else{
//                    System.out.println("su signo es geminis");
//                }
//            case 7:
//                if(dia >= 23){
//                    System.out.println("su signo es leo");
//                }else {
//                    System.out.println("su signo es cancer");
//                }
//            case 8:
//                if(dia >= 23){
//                    System.out.println("su signo es virgo");
//                }else{
//                    System.out.println("su signo es leo");
//                }
//            case 9:
//                if(dia >= 23){
//                    System.out.println("su signo es libra");
//                }else{
//                    System.out.println("su signo es virgo");
//                }
//            case 10:
//                if(dia >= 23){
//                    System.out.println("su signo es escorpion");
//                }else{
//                    System.out.println("su signo es libra");
//                }
//            case 11:
//                if(dia >= 22){
//                    System.out.println("su signo es sagitario");
//                }else{
//                    System.out.println("su signo es escorpion");
//                }
//            case 12:
//                if(dia >= 22){
//                    System.out.println("su signo es capricornio");
//                }else{
//                    System.out.println("su signo es sagitario");
//                }
//
//        }
//        entrada.close();

        /*Ejercicio 13: Calculadora de Tarifa de Taxi
Desarrolla un programa que calcule el costo de un viaje en taxi basándose en la distancia del viaje
(en kilómetros) y la tarifa base. Puedes añadir una tarifa adicional por kilómetro recorrido. El
usuario debe ingresar la distancia del viaje.*/

//        float tarifaAdicional = 1.200f;
//        float tarifaBase = 3.800f;
//        float distancia;
//        float costo;
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese la distancia recorrida");
//        distancia = entrada.nextFloat();
//
//        costo = (distancia * tarifaAdicional) + tarifaBase;
//        System.out.println("El costo del viaje es: "+ costo);
//
//        entrada.close();

        /*Ejercicio 14: Convertidor de Temperatura
Crea un programa que convierta temperaturas entre grados Celsius y Fahrenheit. El usuario debe
poder elegir si quiere convertir de Celsius a Fahrenheit o viceversa, y luego ingresar la temperatura.
Utiliza la fórmula C = (F - 32) * 5/9 para Fahrenheit a Celsius y F = C * 9/5 + 32 para Celsius a
Fahrenheit.*/
//        int option;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese una de las opciones para transformar: 1. Celcius -farenheit 2. farenheit -celcius");
//        option = entrada.nextInt();
//        float temperatura;
//
//        switch (option){
//            case 1:
//
//                System.out.println("Ingrese la temperatura en celcius");
//                temperatura = entrada.nextFloat();
//                float farenheit = temperatura * (9/5) +32;
//                System.out.println("La temperatura en farenheit es de:"+ farenheit);
//                break;
//            case 2:
//                System.out.println("Ingrese la temperatura en farenheit");
//                temperatura = entrada.nextFloat();
//                float celcius = (temperatura - 32) * 5/9;
//                System.out.println("La temperatura en celsius es de:" + celcius);
//                break;
//
//        }
//        entrada.close();

        /*Ejercicio 15: Sistema de Calificaciones
Implementa un programa que le pida al usuario la calificación de un examen (0-100). Basado en la
calificación, el programa debe mostrar una letra (A, B, C, D, F), donde A es 90-100, B es 80-89,
etc. Considera utilizar if o switch.*/

        // int calificacion;
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Ingrese una calificacion entre 0-100");
        // calificacion = entrada.nextInt();

        // if(calificacion >= 90 && calificacion <=100){
        //     System.out.println("La calificacion es A");
        // }else if(calificacion >=80 && calificacion <= 89){
        //     System.out.println("La calificacion es B");
        // }else if(calificacion >= 60 && calificacion <= 79){
        //     System.out.println("La calificacion es C");
        // }else if(calificacion >= 30 && calificacion <= 59){
        //     System.out.println("La calificacion es D");
        // } else if (calificacion >= 0 && calificacion <= 29) {
        //     System.out.println("La calificacion es F");
        // }
        // entrada.close();

        /*Ejercicio 16: Contraseña segura
Crea un programa que valide si una contraseña es segura o no, que
responda con un booleano. (Una contraseña segura debe contener
mínimo 8 caracteres con al menos 1 mayúscula, 1 minúscula y 1
carácter espacial)*/

//        String contraseña;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese una contraseña");
//        contraseña = entrada.nextLine();
//        boolean mayuscula = false;
//        boolean minuscula = false;
//        for (int i = 0; i < contraseña.length(); i++) {
//            if (Character.isUpperCase(contraseña.charAt(i))) {
//                mayuscula = true;
//            }
//            if (Character.isLowerCase(contraseña.charAt(i))) {
//                minuscula = true;
//            }
//
//        }
//        if (mayuscula && minuscula && contraseña.length() >=
//        8) {
//            System.out.println("La contraseña es segura");
//        } else {
//            System.out.println("La contraseña no es segura");
//        }
//        entrada.close();

        /*Ejercicio 17: Identificador de carácter
Crea un programa que pida al usuario un carácter e imprima en
consola si es una consonante, vocal o carácter especial.*/

//    char caracter;
//    Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese un caracter: ");
//        String input = entrada.nextLine();
//        caracter = input.charAt(0);
//
//        if(Character.isUpperCase(caracter)){
//            System.out.println("El caracter es una letra Mayuscula");
//        }else if(Character.isLowerCase(caracter)){
//            System.out.println("Es una letra minuscula");
//        }else if (Character.isDigit(caracter)){
//            System.out.println("El caracter es un numero");
//        }else{
//            System.out.println("El caracter es un signo especial");
//        }
//
//        entrada.close();

        /*Ejercicio 18: Juego de piedra, papel o tijera:
Crear un programa que simule el juego de piedra, papel o tijera
contra el usuario. Permitir al usuario elegir entre piedra, papel o
tijera. Determinar el ganador del juego y mostrar el resultado.*/

//        int piedra = 1;
//        int papel = 2;
//        int tijera = 3;
//
//        int jugador;
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Elija una opcion para tirar: 1.Piedra 2.Papel 3.Tijera");
//        jugador = entrada.nextInt();
//
//        Random random = new Random();
//        int maquina = random.nextInt(3);
//        maquina = maquina +1;
//        System.out.println("el numero aleatorio es: "+ maquina);
//
//        if(jugador == 1 && maquina == 3 || jugador == 2 && maquina == 1 || jugador == 3 && maquina == 2){
//            System.out.println("Jugador 1 Gana");
//        }else if(maquina == 1 && jugador == 3 || maquina == 2 && jugador == 1 || maquina == 3 && jugador == 2){
//            System.out.println("La maquina Gano");
//        }else{
//            System.out.println("Hubo un empate");
//        }
//        entrada.close();

        /*Ejercicio 19: Calculadora de edad:
Crea un programa que solicite la fecha de nacimiento al usuario (año,
mes y día). Calcule la edad e imprima su edad y si es mayor de edad o
no.*/
//        int year,mes,dia,edad;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese el año de nacimiento");
//        year = entrada.nextInt();
//        System.out.println("Ingrese el mes de nacimiento");
//        mes = entrada.nextInt();
//        System.out.println("Ingrese un dia de nacimiento");
//        dia = entrada.nextInt();
//
//        LocalDate fechaActual = LocalDate.now();
//        int yearActual = fechaActual.getYear();
//        int mesActual = fechaActual.getMonthValue();
//        int diaActual = fechaActual.getDayOfMonth();
//        if(mes > mesActual && dia > diaActual){
//            edad = (yearActual - year) - 1;
//            System.out.println("Su edad es de: "+ edad);
//        }else {
//            edad = yearActual - year;
//            System.out.println("Su edad es : "+edad);
//        }
//        entrada.close();


        /*Ejercicio 20: Cifrado César:
Escribe un método que cifre y descifre un mensaje utilizando el
cifrado César con un desplazamiento dado.*/


        String alfabeto = "abcdefghijklmnñopkrstuvwxyz";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = entrada.nextLine();

        String fraseCodificada = codificar(alfabeto, frase);
        System.out.println("Frase codificada: " + fraseCodificada);

        String fraseDescodificada = Descodificador(alfabeto,frase);
        System.out.println("Frase descodificada: " + fraseDescodificada);

    }
    public static String codificar (String alfabeto, String frase){
        String fraseCodificada = "";
        char caracter;
        for (int i = 0; i<frase.length(); i++){
            caracter =  frase.charAt(i);

            int posicion = alfabeto.indexOf(caracter);

            if(posicion == -1){
                fraseCodificada += caracter;
            }else{
                int nuevaPosicion = (posicion +3) % alfabeto.length();
                fraseCodificada += alfabeto.charAt(nuevaPosicion);
            }
        }
        return fraseCodificada;
    }

    public static String Descodificador (String alfabeto, String fraseCodificada){
        String fraseDescodificada = "";
        char caracter;
        for (int i = 0; i <fraseCodificada.length(); i++){
                caracter =  fraseCodificada.charAt(i);
                int posicion = alfabeto.indexOf(caracter);
                if(posicion == -1){
                        fraseDescodificada += caracter;
                }else{
                        if(posicion - 3 < 0){
                                fraseDescodificada += alfabeto.charAt(alfabeto.length() + (posicion - 3));
                        }else{
                                fraseDescodificada += alfabeto.charAt((posicion - 3) % alfabeto.length());
                        }
                        
                }
        }
                return fraseDescodificada;

    }

}