package ejercicios;

import java.util.ArrayList;

import static ejercicios.Planificadordetareas.*;
import static ejercicios.RecursosySuministros.calcularEstadísticas;
import static ejercicios.SistemadeAlertayMonitoreo.*;

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

public void comunicador() {
    int[] consumoagua = {10, 15, 20, 25, 30}; // litros por día
    int[] consumocomida = {500, 600, 700, 800, 900}; // gramos por día
    int[] consumooxigeno = {50, 60, 70, 80, 90}; // litros por día

    // Calcular estadísticas para diferentes periodos
    calcularEstadísticas(consumoagua, "agua");
    calcularEstadísticas(consumocomida, "comida");
    calcularEstadísticas(consumooxigeno, "oxígeno");
}
public class planificador() {
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
public class void alerta() {
    double radiacion = 75.6;
    double temperatura = 25.5;
    double presion = 1013.2;

    monitorearvariables(radiacion, temperatura, presion);
    indentificareventosraros(radiacion, temperatura, presion);

    // Descomposicion de problemas complejos
    int n = 10;
    listarprimeroseventosraros(n);
}
}
}
