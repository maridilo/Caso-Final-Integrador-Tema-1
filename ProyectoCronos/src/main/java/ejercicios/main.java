package ejercicios;

import ejercicios.CronómetroCósmico;

import static ejercicios.RecursosySuministros.calcularEstadísticas;

public class main {
    public static void main(String[] args) {
        // Definir la duración de un día y un año en el nuevo planeta (ejemplo)
        double duraciónDíaPlaneta = 20; // en segundos
        double duraciónAñoPlaneta = 400; // en días terrestres

        // Crear un cronómetro cósmico para el nuevo planeta
        CronómetroCósmico cronómetro = new CronómetroCósmico("Nuevo Planeta", duraciónDíaPlaneta, duraciónAñoPlaneta);

        // Convertir y mostrar tiempo para 1 día en la Tierra (86400 segundos)
        cronómetro.convertirYMostrarTiempo(86400);
    }
    public static void calcularEstadísticas(int[] consumo, String recurso) {
        int[] consumoagua = {10, 15, 20, 25, 30}; // litros por día
        int[] consumocomida = {500, 600, 700, 800, 900}; // gramos por día
        int[] consumooxigeno = {50, 60, 70, 80, 90}; // litros por día

        // Calcular estadísticas para diferentes periodos
        calcularEstadísticas(consumoagua, "agua");
        calcularEstadísticas(consumocomida, "comida");
        calcularEstadísticas(consumooxigeno, "oxígeno");
    }

}
