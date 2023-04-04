package src;

import java.util.Scanner;

public class ActividadUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea: ");

        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un número");
            sc.next();
        }

        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Posición " + i + " número " + numeros[i]);
        }
    }
}
