import java.util.ArrayList;

public class Planificadordetareas {
    public static void main(String[] args) {
        // Definir tareas y duraciones
        String[] tareas = {"Tarea 1", "Tarea 2", "Tarea 3", "Tarea 4", "Tarea 5"};
        int[] duraciones = {10, 20, 30, 40, 50}; // en minutos

        // Distribucion automatica y optimizacion de tareas
        ArrayList<String>[] horarios = distribuirTareas(tareas, duraciones);

        // Mostrar horarios
        visualizarHorarios(horarios);

        // Calculo de carga de trabajo optima
        int[] disponibilidadTripulacion = {480, 480, 480, 480, 480}; // en minutos
        int cargaOptima = calcularCargaOptima(duraciones, disponibilidadTripulacion);
        System.out.println("La carga de trabajo óptima es: " + cargaOptima + " minutos");
    }

}
