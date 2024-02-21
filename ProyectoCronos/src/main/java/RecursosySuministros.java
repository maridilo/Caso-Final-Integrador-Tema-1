import java.util.Arrays;

public class RecursosySuministros {
    private static final int Dias_de_la_semana = 7;
    private static final int Dias_del_mes = 30;

    public static void main(String[] args) {
        int[] consumoagua = {10, 15, 20, 25, 30}; // litros por día
        int[] consumocomida = {500, 600, 700, 800, 900}; // gramos por día
        int[] consumooxigeno = {50, 60, 70, 80, 90}; // litros por día

        // Calcular estadísticas para diferentes periodos
        calcularEstadísticas(consumoagua, "agua");
        calcularEstadísticas(consumocomida, "comida");
        calcularEstadísticas(consumooxigeno, "oxígeno");
    }
    public static void calcularEstadísticas(int[] consumo, String recurso) {
        System.out.println("Estadísticas del consumo de " + recurso + ":");
        // Calcular estadísticas generales
        int total = calcularTotal(consumo);
        int media = calcularMedia(consumo);
        int maximo = calcularMaximo(consumo);
        int minimo = calcularMinimo(consumo);
        // Mostrar estadisticas
        System.out.println("Total consumido: " + total);
        System.out.println("Consumo medio: " + media);
        System.out.println("Máximo consumo: " + maximo);
        System.out.println("Mínimo consumo: " + minimo);
        System.out.println();

        // Alerta si el consumo es muy bajo o muy alto
        if (minimo < 0.5 * maximo) {
            System.out.println("ALERTA: El consumo mínimo de " + recurso + "es muy bajo");
        }
    }
    public static int calcularTotal(int[] consumo) {
        int total = 0;
        for (int i = 0; i < consumo.length; i++) {
            total += consumo[i];
        }
        return total;
    }
public static int calcularMedia(int[] consumo) {
    return calcularTotal(consumo) / consumo.length;
}
public static int calcularMaximo(int[] consumo) {
    int maximo = consumo[0];
    for (int i = 1; i < consumo.length; i++) {
        if (consumo[i] > maximo) {
            maximo = consumo[i];
        }
    }
    return maximo;
}
public static int calcularMinimo(int[] consumo) {
    int minimo = consumo[0];
    for (int i = 1; i < consumo.length; i++) {
        if (consumo[i] < minimo) {
            minimo = consumo[i];
        }
    }
    return minimo;
}
}


