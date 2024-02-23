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

}
