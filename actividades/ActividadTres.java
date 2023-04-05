package actividades;

public class ActividadTres {
    public static int[] cargarArregloRandom(int cantidad) {
        int[] numerosRandom = new int[cantidad];

        for (int i = 0; i < numerosRandom.length; i++) {
            numerosRandom[i] = (int) (Math.random() * 100);
            if (checkRepetidos(numerosRandom)) {
                i--;
            }
        }

        return numerosRandom;
    }

    public static boolean checkRepetidos(int[] numeros) {
        boolean hayRepetido = false;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    hayRepetido = true;
                    break;
                }
            }
        }
        return hayRepetido;
    }
}
