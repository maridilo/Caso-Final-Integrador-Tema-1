
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import ejercicios.NavegadorEstelar;
import static org.junit.jupiter.api.Assertions.*;

@Nested
class NavegadorEstelarTest {

        @Test
        <fun>
        void foo() {
            assertEquals(1, 0); // highlighted
        }
        public void testGenerarRutaOptimaExitosa() {
            NavegadorEstelar navegador = new NavegadorEstelar();
            assertEquals(true, navegador.generarRutaOptima()); // El navegador puede generar una ruta óptima

        }
        @Test
        public void testGenerarRutaOptimaFallida() {
            NavegadorEstelar navegador = new NavegadorEstelar();
            assertFalse(navegador.generarRutaOptima()); // El navegador no puede generar una ruta óptima
        }

        @Test
        public void testCalcularMatricesValidas() {
            NavegadorEstelar navegador = new NavegadorEstelar();
            Object datos = new Object();
            assertNotNull(navegador.calcularMatrices(datos)); // Verificar que las matrices se calculan correctamente
        }
    }

