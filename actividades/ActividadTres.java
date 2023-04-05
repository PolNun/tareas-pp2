package actividades;

public class ActividadTres {
    public static int[] cargarArregloRandom(int cantidad) {
        int[] numerosRandom = new int[cantidad];

        for (int i = 0; i <= numerosRandom.length; i++) {
            numerosRandom[i] = ((int) Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (numerosRandom[i] == numerosRandom[j]) {
                    i--;
                    break;
                }
            }
        }
        return numerosRandom;
    }
}
