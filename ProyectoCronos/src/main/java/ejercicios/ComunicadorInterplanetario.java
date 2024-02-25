package ejercicios;

import java.util.ArrayList;

public class ComunicadorInterplanetario {
private ArrayList<String> mensajes;
public ComunicadorInterplanetario() {
    mensajes = new ArrayList<>();
}
public void enviarMensaje(String mensaje) {
    // Simular envio de mensaje desde la Tierra a la base espacial
    mensajes.add(traducirMensaje(mensaje));
}
public void recibirMensajes(String mensaje) {
    // Simular recepcion de mensajes en la base espacial
    mensajes.add(traducirMensaje(mensaje));
    }
    private String traducirMensaje(String mensaje) {
        // Traducir mensaje de un idioma a otro
        int conteoVocales = contarVocales(mensaje);
        String mensajeInvertido = invertirMensaje(mensaje);
        boolean esPalindromo = verificarPalindromo(mensaje);

// Crear mensaje traducido
        String mensajeTraducido = "Mensaje original: " + mensaje;
        mensajeTraducido += "\nConteo de vocales: " + conteoVocales;
        mensajeTraducido += "\nMensaje invertido: " + mensajeInvertido;
        mensajeTraducido += "\nEs palindromo: " + esPalindromo;
        return mensajeTraducido;
    }
    private int contarVocales(String mensaje) {
        int conteo = 0;
        for (char letra : mensaje.toCharArray()) {
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                conteo++;
            }
        }
        return conteo;
    }
    private String invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            mensajeInvertido.append(mensaje.charAt(i));
        }
        return mensajeInvertido.toString();
    }
    private boolean verificarPalindromo(String mensaje) {
        String mensajeLimpio = mensaje.toLowerCase().replaceAll("[^a-z]", "");
        String mensajeInvertido = invertirMensaje(mensajeLimpio);
        for (int i = 0; i < mensajeLimpio.length() / 2; i++) {
            if (mensajeLimpio.charAt(i) != mensajeInvertido.charAt(mensajeLimpio.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public void visualizarMensajes() {
        System.out.println("Mensajes recibidos:");
        for (String mensaje : mensajes) {
            System.out.println(mensaje);
        }
    }
    public static void main(String[] args) {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        comunicador.enviarMensaje("Hola, ¿cómo están?");
        comunicador.enviarMensaje("¿Cuál es la situación en Marte?");
        comunicador.recibirMensajes("Todo bien, gracias");
        comunicador.visualizarMensajes();
    }
}
// Path: ProyectoCronos/src/ejercicios.main/java/ejercicios.ComunicadorInterplanetario.java