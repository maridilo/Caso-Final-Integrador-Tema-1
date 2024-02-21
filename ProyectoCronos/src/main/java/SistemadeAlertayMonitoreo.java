import java.util.ArrayList;

public class SistemadeAlertayMonitoreo {
    public static void main(String[] args) {
        double radiacion = 75.6;
        double temperatura = 25.5;
        double presion = 1013.2;

        monitorearvariables(radiacion, temperatura, presion);
        indentificareventosraros(radiacion, temperatura, presion);

        // Descomposicion de problemas complejos
        int n = 10;
        listarprimeroseventosraros(n);
    }
    public static void monitorearvariables(double radiacion, double temperatura, double presion) {
        System.out.println("Monitoreo de variables ambientales:");
        System.out.println("Radiación: " + radiacion + " uSv/h");
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Presión: " + presion + " mbar");
        System.out.println();
    }
    public static void indentificareventosraros(double radiacion, double temperatura, double presion) {
        if (radiacion > 100 || temperatura > 30 || presion < 1000) {
            System.out.println("ALERTA: Evento raro detectado");
        }
    }
    public static void listarprimeroseventosraros(int n) {
        System.out.println("Listado de los primeros " + n + " eventos raros:");
        ArrayList<Integer> eventosraros = new ArrayList<>();

        int i = 2;
        while (eventosraros.size() < n) {
            if (esPrimo(i)) {
                eventosraros.add(i);
            }
            i++;
        }
        System.out.println("Los primeros " + n + " eventos raros son:");
        for (int evento : eventosraros) {
            System.out.println(evento + " ");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

