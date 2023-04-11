package actividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActividadTresOOP {
    public int n;
    public List<Integer> numeros;
    public List<Integer> numerosRandom;
    public Scanner scanner;

    public ActividadTresOOP(int n) {
        this.n = n;
        this.numeros = new ArrayList<>();
        this.numerosRandom = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void generarNumerosRandom() {
        for (int i = 0; i < n; i++) {
            int numeroRandom;
            do {
                numeroRandom = (int) (Math.random() * 100);
            } while (numerosRandom.contains(numeroRandom));
            numerosRandom.add(numeroRandom);
        }
    }

    public void ingresarNumeros() {
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingresá un número para la posición %d: ", i);
            numeros.add(scanner.nextInt());
        }
    }

    public void mostrarNumeros(List<Integer> numeros) {
        System.out.println("Los números son:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("Posición %d número %d\n", i, numeros.get(i));
        }
    }

    public void modificarNumeros() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Deseás modificar algún número? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("s")) {
                mostrarNumeros(numeros);
                System.out.println("Ingresá la posición del número que deseás modificar:");
                int posicion = scanner.nextInt();
                System.out.println("Ingresá el nuevo valor:");
                int valor = scanner.nextInt();
                numeros.set(posicion, valor);
            } else {
                continuar = false;
            }
        }
    }

    public void validarNumeros() {
        boolean continuar;
        do {
            continuar = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (numeros.get(i).equals(numeros.get(j))) {
                        System.out.println("Ingresaste un número repetido.");
                        mostrarNumeros(numeros);
                        System.out.println("Por favor ingresá otro para la posición " + i);
                        numeros.set(i, scanner.nextInt());
                        continuar = true;
                        break;
                    }
                }
                if (continuar) break;
            }
        } while (continuar);
    }

    public void mostrarResultado() {
        int cantidadCoincidencias;
        do {
            System.out.println("\nIntentá adivinar los números random.");
            System.out.println("Ingresá los números que creas que son:");
            mostrarNumeros(numeros);
            cantidadCoincidencias = 0;
            for (int i = 0; i < n; i++) {
                System.out.printf("Ingresá el número para la posición %d: ", i);
                Integer numero = scanner.nextInt();
                if (numero.equals(numerosRandom.get(i))) {
                    cantidadCoincidencias++;
                }
            }
            if (cantidadCoincidencias != n) {
                System.out.printf("\nPerdiste :( (hubo %d coincidencias)", cantidadCoincidencias);
            }
        } while (cantidadCoincidencias != n);
    }
}

//public class ActividadTres {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingresá la cantidad de números que deseás:");
//        int n = scanner.nextInt();
//        int[] numeros = new int[n];
//        int[] numerosRandom = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int numeroRandom = (int) (Math.random() * 100);
//            boolean numeroRepetido = false;
//            for (int j = 0; j < i; j++) {
//                if (numeroRandom == numerosRandom[j]) {
//                    numeroRepetido = true;
//                    break;
//                }
//            }
//            if (numeroRepetido) {
//                i--;
//            } else {
//                numerosRandom[i] = numeroRandom;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Ingresá un número para la posición %d: ", i);
//            numeros[i] = scanner.nextInt();
//        }
//
//        System.out.println("Los números son:");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Posición %d número %d\n", i, numeros[i]);
//        }
//
//        boolean continuar = true;
//        while (continuar) {
//            System.out.println("¿Deseás modificar algún número? (s/n)");
//            String respuesta = scanner.next();
//            if (respuesta.equalsIgnoreCase("s")) {
//                System.out.println("Estos son los números:");
//                for (int i = 0; i < n; i++) {
//                    System.out.printf("Posición %d número %d\n", i, numeros[i]);
//                }
//                System.out.println("Ingresá la posición del número que deseás modificar:");
//                int posicion = scanner.nextInt();
//                System.out.println("Ingresá el nuevo valor:");
//                int valor = scanner.nextInt();
//                numeros[posicion] = valor;
//            } else {
//                continuar = false;
//            }
//        }
//
//        do {
//            continuar = false;
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < i; j++) {
//                    if (numeros[i] == numeros[j]) {
//                        System.out.println("Ingresaste un número repetido.");
//                        for (int k = 0; k < n; k++) {
//                            System.out.printf("Posición %d número %d\n", k, numeros[k]);
//                            System.out.println(numerosRandom[k]);
//                        }
//                        System.out.println("Por favor ingresá otro número para la posición " + i);
//                        numeros[i] = scanner.nextInt();
//                        continuar = true;
//                        break;
//                    }
//                }
//                if (continuar) break;
//            }
//        } while (continuar);
//
//        int cantidadCoincidencias = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (numeros[i] == numerosRandom[j]) {
//                    cantidadCoincidencias++;
//                }
//            }
//        }
//
//        if (cantidadCoincidencias > 0 && cantidadCoincidencias < n) {
//            System.out.println("\nNo ganaste, pero te salvaste :)");
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (numeros[i] == numerosRandom[j]) {
//                        System.out.println("El número " + numeros[i] + " coincide con el número " + numerosRandom[j]);
//                    }
//                }
//            }
//        } else if (cantidadCoincidencias == n) {
//            System.out.println("\nGanaste :D");
//        } else {
//            System.out.println("\nPediste :(");
//        }
//
//        System.out.println("\nLos números finales son:");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Posición %d número %d\n", i, numeros[i]);
//        }
//    }
//}


