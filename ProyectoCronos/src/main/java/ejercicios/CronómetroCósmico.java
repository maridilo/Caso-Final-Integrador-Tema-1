package ejercicios;

public class CronómetroCósmico {
private static final double DURACIÓN_DÍA_TIERRA = 24 * 60 * 60;
private static final double DURACIÓN_AÑO_TIERRA = 365.25 * DURACIÓN_DÍA_TIERRA;

private  String nombrePlaneta;
private  double duraciónDíaPlaneta;
private  double duraciónAñoPlaneta;

public CronómetroCósmico(String nombrePlaneta, double duraciónDíaPlaneta, double duraciónAñoPlaneta) {
    this.nombrePlaneta = nombrePlaneta;
    this.duraciónDíaPlaneta = duraciónDíaPlaneta;
    this.duraciónAñoPlaneta = duraciónAñoPlaneta;
}

private void mostrarTiempo(double segundos) {
    double minutos = segundos / 60;
    double horas = minutos / 60;
    double días = horas / 24;
    double años = días / 365.25;
    System.out.println("Años: " + años);
    System.out.println("Días: " + días);
    System.out.println("Horas: " + horas);
    System.out.println("Minutos: " + minutos);
    System.out.println("Segundos: " + segundos);
    System.out.println();
}
    public void convertirYMostrarTiempo(double segundosTierra) {
        // Convertir tiempo de la Tierra al nuevo planeta
        double segundosPlaneta = segundosTierra * (DURACIÓN_DÍA_TIERRA / duraciónDíaPlaneta);
        double minutosPlaneta = segundosPlaneta / 60;
        double horasPlaneta = minutosPlaneta / 60;
        double díasPlaneta = horasPlaneta / 24;
        double añosPlaneta = díasPlaneta / duraciónAñoPlaneta;

    // Mostrar el tiempo en diferentes formatos
        System.out.println("Tiempo en la Tierra:");
    mostrarTiempo(segundosTierra);

        System.out.println("Tiempo en el planeta " + nombrePlaneta + ":");
    mostrarTiempo(segundosPlaneta);

    // Identificar límites de representación de datos
    identificarLímitesDatos();
}

        private void identificarLímitesDatos() {
            System.out.println("Mayor valor representable en un entero de 32 bits: " + Integer.MAX_VALUE);
            System.out.println("Mayor valor representable en un entero de 64 bits: " + Long.MAX_VALUE);
        }
    public static void main(String[] args) {
        // Definir la duración de un día y un año en el nuevo planeta (ejemplo)
        double duraciónDíaPlaneta = 20; // en segundos
        double duraciónAñoPlaneta = 400; // en días terrestres

        // Crear un cronómetro cósmico para el nuevo planeta
        CronómetroCósmico cronómetro = new CronómetroCósmico("Nuevo Planeta", duraciónDíaPlaneta, duraciónAñoPlaneta);

        // Convertir y mostrar tiempo para 1 día en la Tierra (86400 segundos)
        cronómetro.convertirYMostrarTiempo(86400);
    }
}

