import ejercicios.ComunicadorInterplanetario;
import org.junit.Test;

import static org.junit.Assert.*;
@Test
public void testEnviarMensaje() {
    ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
    comunicador.enviarMensaje("Hola, ¿cómo están?");
    comunicador.enviarMensaje("¿Cuál es la situación?");
    comunicador.enviarMensaje("¿Hay novedades?");
    comunicador.visualizarMensajes();
}

public void main() {
}
