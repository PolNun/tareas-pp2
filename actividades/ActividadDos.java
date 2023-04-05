package actividades;

public class ActividadDos {
    public static int[] modificarArreglo(int posicion, int nuevoValor, int[] numeros) {
        numeros[posicion] = nuevoValor;
        return numeros;
    }

    public static int sumarElementos(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public static float mediaElementos(int[] numeros) {
        float media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];
        }
        return media / numeros.length;
    }
}
