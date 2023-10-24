package clase2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String respuesta;
		int rondas = 0;
		int puntosJugador1 = 0;
		int puntosJugador2 = 0;
		int maxPuntos = 10;
		int jug1;
		int jug2;

		do {
			rondas = 0;
			puntosJugador1 = 0;
			puntosJugador2 = 0;
			while (rondas < 3) {
				int aleatorio = (int) (Math.random() * 3);
				rondas++;
				System.out.println("Ronda " + rondas);
				System.out.println("Ingrese numero jugador 1: ");
				jug1 = scanner.nextInt();
				System.out.println("Ingrese numero jugador 2: ");
				jug2 = scanner.nextInt();

				if (jug1 == aleatorio) {
					System.out.println("Gano la ronda el jugador 1 ");
					puntosJugador1++;
				}
				if (jug2 == aleatorio) {
					System.out.println("Gano la ronda el jugador 2 ");
					puntosJugador2++;
				}
				if (jug1 == aleatorio && jug2 == aleatorio) {
					System.out.println("Empate");

				}
				if (jug1 != aleatorio && jug2 != aleatorio) {
					System.out.println("mala suerte");
				}

				System.out.println("===================================");
				System.out.println(" Jugador 1: " + puntosJugador1 + " Jugador 2: " + puntosJugador2);
				System.out.println("");

				scanner.nextLine();

			}

			if (puntosJugador1 > puntosJugador2) {
				System.out.println("Ha ganado el jugador 1 con: " + puntosJugador1);
			} else if (puntosJugador2 > puntosJugador1) {
				System.out.println("Ha ganado el jugador 2 con: " + puntosJugador2);
			} else if (puntosJugador2 == puntosJugador1) {
				System.out.println("Empate");
			}
			System.out.println("===================================");
			System.out.println("Desea continuar s/n");
			respuesta = scanner.nextLine();

		} while (!respuesta.equals("n"));

		System.out.println("Fin del juego");

	}
}
