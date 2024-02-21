import java.util.Arrays;

public class RecursosySuministros {
    private static final int DIAS_EN_SEMANA = 7;
    private static final int DIAS_EN_MES = 30;

    public static void main(String[] args) {
        int[] consumoAgua = {10, 15, 20, 25, 30}; // Consumo diario de agua en litros
        int[] consumoComida = {500, 600, 700, 800, 900}; // Consumo diario de comida en gramos
        int[] consumoOxigeno = {50, 60, 70, 80, 90}; // Consumo diario de oxígeno en litros

        // Calcular estadísticas para diferentes períodos
        calcularEstadisticas(consumoAgua, "agua");
        calcularEstadisticas(consumoComida, "comida");
        calcularEstadisticas(consumoOxigeno, "oxígeno");
    }

    public static void calcularEstadisticas(int[] consumo, String recurso) {
        System.out.println("Estadísticas del consumo de " + recurso + ":");

        // Calcular estadísticas generales
        int total = calcularTotal(consumo);
        int media = calcularMedia(consumo);
        int minimo = calcularMinimo(consumo);
        int maximo = calcularMaximo(consumo);

        // Mostrar estadísticas
        System.out.println("Total consumido: " + total);
        System.out.println("Consumo medio: " + media);
        System.out.println("Mínimo consumido: " + minimo);
        System.out.println("Máximo consumido: " + maximo);

        // Alerta si el consumo mínimo es menor que un umbral seguro (por ejemplo, 50% del máximo)
        if (minimo < 0.5 * maximo) {
            System.out.println("¡Alerta! El consumo mínimo de " + recurso + " está por debajo del umbral seguro.");
        }
    }

    public static int calcularTotal(int[] consumo) {
        int total = 0;
        for (int c : consumo) {
            total += c;
        }
        return total;
    }

    public static int calcularMedia(int[] consumo) {
        return calcularTotal(consumo) / consumo.length;
    }

    public static int calcularMinimo(int[] consumo) {
        int minimo = consumo[0];
        for (int c : consumo) {
            if (c < minimo) {
                minimo = c;
            }
        }
        return minimo;
    }

    public static int calcularMaximo(int[] consumo) {
        int maximo = consumo[0];
        for (int c : consumo) {
            if (c > maximo) {
                maximo = c;
            }
        }
        return maximo;
    }
}

