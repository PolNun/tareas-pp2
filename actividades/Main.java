//package actividades;
//
//import java.util.Scanner;
//
//import static actividades.ActividadDos.*;
//import static actividades.ActividadTres.cargarArregloRandom;
//import static actividades.ActividadUno.cargarArreglo;
//import static actividades.ActividadUno.mostrarArreglo;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingrese la cantidad de números: ");
//        int cantidad = sc.nextInt();
//        int[] numeros = new int[cantidad];
//        int[] numerosRandom = cargarArregloRandom(cantidad);
//
//        cargarArreglo(cantidad, numeros, sc);
//
//        boolean seguirModificando = false;
//
//        do {
//            System.out.println("¿Desea modificar algún elemento? (s/n)");
//            char respuesta = sc.next().charAt(0);
//
//            switch (respuesta) {
//                case 's' -> {
//                    mostrarArreglo(numeros);
//                    System.out.println("Ingrese la posición del elemento a modificar: ");
//                    int posicion = sc.nextInt();
//                    System.out.println("Ingrese el nuevo valor: ");
//                    int nuevoValor = sc.nextInt();
//                    modificarArreglo(posicion, nuevoValor, numeros);
//                    seguirModificando = true;
//                }
//                case 'n' -> {
//                    System.out.println("La suma de elementos es: " + sumarElementos(numeros));
//                    System.out.println("La media de elementos es: " + mediaElementos(numeros));
//                    mostrarArreglo(numeros);
//                    System.exit(0);
//                }
//            }
//        } while (seguirModificando);
//
//
//        sc.close();
//    }
//}
