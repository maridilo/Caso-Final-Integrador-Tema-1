import org.junit.jupiter.api.Test;

public class CronometroCosmicotest {
    @Test
    public void testMonitorearvariables() {
        double radiacion = 75.6;
        double temperatura = 25.5;
        double presion = 1013.2;
        SistemadeAlertayMonitoreo.monitorearvariables(radiacion, temperatura, presion);
    }
}
