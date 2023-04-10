package actividades;

import java.util.Scanner;

public class ActividadUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese el tamaño del array
        System.out.println("Hola, ingresa la cantidad de numeros que deseas:");
        int n = sc.nextInt();

        // Creamos el array
        int[] numeros = new int[n];

        // Pedimos al usuario que ingrese los números para cada posición del array
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese un numero para la posicion %d: ", i);
            numeros[i] = sc.nextInt();
        }

        // Mostramos por consola el índice y el valor correspondiente a cada posición del array
        System.out.println("Sus numeros son:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Posicion %d numero %d\n", i, numeros[i]);
        }
    }
}
