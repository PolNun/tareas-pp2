package actividades;

import java.util.Scanner;

public class ActividadTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresá la cantidad de números que deseás:");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int[] numerosRandom = new int[n];

        for (int i = 0; i < n; i++) {
            int numeroRandom = (int) (Math.random() * 100);
            boolean numeroRepetido = false;
            for (int j = 0; j < i; j++) {
                if (numeroRandom == numerosRandom[j]) {
                    numeroRepetido = true;
                    break;
                }
            }
            if (numeroRepetido) {
                i--;
            } else {
                numerosRandom[i] = numeroRandom;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingresá un número para la posición %d: ", i);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números son:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Posición %d número %d\n", i, numeros[i]);
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Deseás modificar algún número? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equals("s")) {
                System.out.println("Estos son los números:");
                for (int i = 0; i < n; i++) {
                    System.out.printf("Posición %d número %d\n", i, numeros[i]);
                }
                System.out.println("Ingresá la posición del número que deseás modificar:");
                int posicion = scanner.nextInt();
                System.out.println("Ingresá el nuevo valor:");
                int valor = scanner.nextInt();
                numeros[posicion] = valor;
            } else {
                continuar = false;
            }
        }

        System.out.println("Los números finales son:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Posición %d número %d\n", i, numeros[i]);
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los números es: " + suma);

        double promedio = (double) suma / n;
        System.out.println("El promedio de los números es: " + promedio);
    }
}
