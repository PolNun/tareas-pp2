package actividades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresá la cantidad de números que deseás ingresar:");
        int n = scanner.nextInt();
        ActividadTresOOP act3 = new ActividadTresOOP(n);
        act3.generarNumerosRandom();
        act3.ingresarNumeros();
        act3.modificarNumeros();
        act3.validarNumeros();
        act3.mostrarResultado();
    }
}
