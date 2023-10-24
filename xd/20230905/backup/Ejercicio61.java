package clase2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio61 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int intentos = 3;
        int puntajeJugador1 = 0;
        int puntajeJugador2 = 0;

        System.out.println("Bienvenido al juego de adivinanza de números del 1 al 10.");
        System.out.println("Cada jugador tiene 3 intentos para adivinar un número al azar.");
        System.out.println("El jugador con más puntos al final gana.");
        System.out.println();

        while (intentos > 0) {
            int numeroAdivinanza = random.nextInt(10) + 1;

            System.out.println("Número a adivinar: "+numeroAdivinanza);
            System.out.println("Turno del Jugador 1.");
            int intentoJugador1 = obtenerNumero(scanner);

            if (intentoJugador1 == numeroAdivinanza) {
                System.out.println("¡Jugador 1 acertó!");
                puntajeJugador1 += random.nextInt(10) + 1;
            } else {
                System.out.println("Jugador 1 falló.");
            }

            System.out.println("Turno del Jugador 2.");
            int intentoJugador2 = obtenerNumero(scanner);

            if (intentoJugador2 == numeroAdivinanza) {
                System.out.println("¡Jugador 2 acertó!");
                puntajeJugador2 += random.nextInt(10) + 1;
            } else {
                System.out.println("Jugador 2 falló.");
            }

            intentos--;
        }

        System.out.println("Fin del juego.");
        System.out.println("Puntaje del Jugador 1: " + puntajeJugador1);
        System.out.println("Puntaje del Jugador 2: " + puntajeJugador2);

        if (puntajeJugador1 > puntajeJugador2) {
            System.out.println("¡Jugador 1 gana!");
            imprimirBarra("Jugador 1","@",puntajeJugador1);
        } else if (puntajeJugador2 > puntajeJugador1) {
            System.out.println("¡Jugador 2 gana!");
            imprimirBarra("Jugador 2","@",puntajeJugador2);
        } else {
            System.out.println("¡Es un empate!");
        }

        scanner.close();
    }

    private static void imprimirBarra(String mensaje, String icono, int puntajeJugador1) {
		// TODO Auto-generated method stub
    	System.out.println(mensaje);
		for (int i = 0; i < puntajeJugador1; i++) {
			System.out.print(icono);
		}
	}

	private static int obtenerNumero(Scanner scanner) {
        System.out.print("Ingrese un número del 1 al 10: ");
        return scanner.nextInt();
    }
}