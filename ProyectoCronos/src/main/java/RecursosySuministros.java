import java.util.Arrays;

public class RecursosySuministros {
    private static final int Dias_de_la_semana = 7;
    private static final int Dias_del_mes = 30;

    public static void main(String[] args) {
        int[] consumoagua = {10, 15, 20, 25, 30}; // litros por día
        int[] consumocomida = {500, 600, 700, 800, 900}; // gramos por día
        int[] consumooxigeno = {50, 60, 70, 80, 90}; // litros por día

        calcularEstadísticas(consumoagua, "agua");
        calcularEstadísticas(consumocomida, "comida");
        calcularEstadísticas(consumooxigeno, "oxígeno");
    }
    public static void calcularEstadísticas(int[] consumo, String recurso) {
        // Calcular estadísticas para diferentes periodos
        calcularEstadísticas(consumo, "agua");
        calcularEstadísticas(consumo, "comida");
        calcularEstadísticas(consumo, "oxígeno");
    }
}

