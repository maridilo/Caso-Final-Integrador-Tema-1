import java.util.ArrayList;

public class ComunicadorInterplanetario {
private ArrayList<String> mensajes;
public ComunicadorInterplanetario() {
    mensajes = new ArrayList<>();
}
public void enviarMensaje(String mensaje) {
    // Simular envio de mensaje desde la Tierra a la base espacial
    mensajes.add(traducirmensaje(mensaje));
}
public void recibirMensajes() {
    // Simular recepcion de mensajes en la base espacial
    mensajes.add(traducirMensaje(mensaje));
    }
    private String traducirMensaje(String mensaje) {
        // Traducir mensaje de un idioma a otro
        int conteoVocales = contarVocales(mensaje);
        String mensajeInvertido = invertirMensaje(mensaje);
        boolean esPalindromo = verificarPalindromo(mensaje);


    }
}
