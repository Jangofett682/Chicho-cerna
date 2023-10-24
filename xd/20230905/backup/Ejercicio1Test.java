package clase2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Ejercicio1Test {
	
	@Test
	public void dadoUnArrayConUnNumeroParDeberiaDevolverTrue() {
		int[] numeros = {5,7,8};
		assertTrue(Ejercicio1.determinarSiHayPar(numeros));
	}

	@Test
	public void dadoUnArraySinNumerosParesDeberiaDevolverFalse() {
		int[] numeros = {5,7,7};
		assertFalse(Ejercicio1.determinarSiHayPar(numeros));
	}

}
