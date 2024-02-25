package ejercicios;

public class NavegadorEstelar {
    public static void main(String[] args) {
        // Definicion del terreno y obstáculos mediante matrices
        int[][] terreno = {
            {0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0}
        };
        visualizarTerreno(terreno);
        // Definicion de construcciones y planificacion de rutas mediante matrices
        int[][] construcciones = {
            {0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0}
        };
        // Multiplicar matrices para obtener rutas y recursos
        int[][] rutasOptimizadas = multiplicarMatrices(terreno, construcciones);
        visualizarRutas(rutasOptimizadas);
    }
public static void visualizarTerreno(int[][] terreno) {
    System.out.println("Terreno y obstaculos:");
    for (int[] fila : terreno) {
        for (int celda : fila) {
            System.out.print(celda + " ");
        }
        System.out.println();
    }
}
public static void visualizarRutas(int[][] rutas) {
    System.out.println("Rutas optimizadas:");
    for (int[] fila : rutas) {
        for (int celda : fila) {
            System.out.print(celda + " ");
        }
        System.out.println();
    }
}
public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
    int filas1 = matriz1.length;
    int columnas1 = matriz1[0].length;
    int columnas2 = matriz2[0].length;
    int[][] resultado = new int[filas1][columnas2];
    for (int i = 0; i < filas1; i++) {
        for (int j = 0; j < columnas2; j++) {
            for (int k = 0; k < columnas1; k++) {
                resultado[i][j] += matriz1[i][k] * matriz2[k][j];
            }
        }
    }
    return resultado;
}
}
