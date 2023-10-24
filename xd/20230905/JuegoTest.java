package clase2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JuegoTest {

	// true false true false true true  Jugador2 = 1punto
	@Test
	public void soloTrueEnPosicion5DeveriaDevolverUnPunto() {
		boolean[] resultados = {true,false,true,false,true,true};
		assertTrue(Juego.puntosJugador2(resultados)==1);		
	}
}
