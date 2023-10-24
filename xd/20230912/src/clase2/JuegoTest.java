package clase2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JuegoTest {

	// true false true false true true  Jugador2 = 1punto
	@Test
	public void soloTrueEnPosicion5DeberiaDevolverUnPunto() {
		boolean[] resultados = {true,false,true,false,true,true};
		assertTrue(Juego.puntosJugador2(resultados)==1);		
	}
	
	@Test
	public void asertaronPorloMenosUnoDeberiaDevolverTrue() {
		boolean[] resultados = {false,true,false,false};
		assertTrue(Juego.asertaronPorloMenosUno(resultados));		
	}
	
	@Test
	public void asertaronTodosListaTodosTrueDeberiaDevolverTrue() {
		boolean[] resultados = {true,true,true,true};
		assertTrue(Juego.asertaronTodos(resultados));		
	}
	
	
}
