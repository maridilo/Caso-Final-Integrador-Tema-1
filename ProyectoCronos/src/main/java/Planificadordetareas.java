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

    public static ArrayList<String>[] distribuirTareas(String[] tareas, int[] duraciones) {
        // Crear horarios para cada tripulante
        int numMiembrosTripulacion = 5;
        ArrayList<String>[] horarios = new ArrayList[numMiembrosTripulacion];
        for (int i = 0; i < numMiembrosTripulacion; i++) {
            horarios[i] = new ArrayList<>();
        }

        // Distribuir tareas de forma equitativa
        int indiceMiembro = 0;
        for (int i = 0; i < tareas.length; i++) {
            horarios[indiceMiembro].add(tareas[i]);
            indiceMiembro = (indiceMiembro + 1) % numMiembrosTripulacion;
        }

        return horarios;
    }

    public static void visualizarHorarios(ArrayList<String>[] horarios) {
        System.out.println("Horarios y cargas de trabajo:");
        for (int i = 0; i < horarios.length; i++) {
            System.out.println("Tripulante " + (i + 1) + ": " + horarios[i]);
        }
        System.out.println();
    }
public static int calcularCargaOptima(int[] duraciones, int[] disponibilidadTripulacion) {
    int cargaOptima = 0;
    for (int i = 0; i < duraciones.length; i++) {
        cargaOptima += duraciones[i];
    }
    return cargaOptima;
}
