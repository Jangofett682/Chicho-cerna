package clase3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EjemploMatrizTest {

	@Test
	public void todosElementosImparesPorFilaDeberiaDevolverTrue() {
		int[] fila = {3,3,3};
		assertTrue(EjemploMatriz.todosElementosImparesPorFila(fila));
	}
}
