public class CronómetroCósmico {
private static final double DURACIÓN_DÍA_TIERRA = 86400;
private static final double DURACIÓN_AÑO_TIERRA = 365.25 * DURACIÓN_DÍA_TIERRA;

private  String nombrePlaneta;
private  double duraciónDíaPlaneta;
private  double duraciónAñoPlaneta;

public CronómetroCósmico(String nombrePlaneta, double duraciónDíaPlaneta, double duraciónAñoPlaneta) {
    this.nombrePlaneta = nombrePlaneta;
    this.duraciónDíaPlaneta = duraciónDíaPlaneta;
    this.duraciónAñoPlaneta = duraciónAñoPlaneta;
}
public void convertirYMostrarTiempo(double segundosTierra) {
    double segundosPlaneta = segundosTierra * duraciónDíaPlaneta / DURACIÓN_DÍA_TIERRA;
    double añosPlaneta = segundosPlaneta / duraciónAñoPlaneta;
    double años = (int) añosPlaneta;
    double días = (añosPlaneta - años) * 365.25;
    System.out.println(segundosTierra + " segundos en la Tierra equivalen a " + años + " años y " + días + " días en " + nombrePlaneta);
}
}

