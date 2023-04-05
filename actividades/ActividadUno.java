package actividades;

import java.util.Scanner;

public class ActividadUno {
    public static int[] cargarArreglo(int cantidad, int[] numeros, Scanner sc) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    public static void mostrarArreglo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número en la posición " + i + " es: " + numeros[i]);
        }
    }
}
