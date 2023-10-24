package clase5_9;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {

	public static void main(String[] args) {
		bienvenida();
		boolean[] resultado = juego();
		resolucion(resultado);
	}
	
	public static void bienvenida() {
		System.out.println("Bienvenidos!\n");
		System.out.println("Intenten adivinar en 10 intentos el numero del 1 al 10 escondido de cada uno!\n");
	}
	public static boolean[] juego() {
		int intento;
		boolean[] resultado = {false, false, false, false, false, false, false, false, false, false};
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			int numeroAdivinar = numeroAleatorio();
			int jugador = 2;
			
			if (i%2 == 0)  {
				jugador = 1;
			}
			
			System.out.println("Va el jugador numero " + jugador);
			System.out.print("Numero: " + numeroAdivinar);
			System.out.println("Ingrese un numero del 1 al 10: ");
			intento = scanner.nextInt();
			
			if (intento == numeroAdivinar) {
				resultado[i] = true;
				System.out.println("Adivinaste! Ganas un punto.\n");
			}else {
				System.out.println("No adivinaste! el numero era " + numeroAdivinar);
			}
			
		}
		scanner.close();
		
		return resultado;
	}
	public static void resolucion (boolean[] res) {
		int puntuacion_1 = 0;
		int puntuacion_2 = 0;
		for (int i = 0; i < 10; i++) {
			if (esPar(i)) {
				if (res[i]) {
					puntuacion_1++;
				}
			}else {
				if (res[i]) {
					puntuacion_2++;
				}
			}
		}
		
		if (puntuacion_1 < puntuacion_2) {
			System.out.println("Gano el jugador numero 2!");
		}
		else if (puntuacion_1 > puntuacion_2) {
			System.out.println("Gano el jugador numero 1!");
		}else {
			System.out.println("Hubo un empate!");
		}
		System.out.println("Puntuacion jugador 1 = " + puntuacion_1 + "\nPuntuacion jugador 2 = " + puntuacion_2);	
	}
	
	public static int numeroAleatorio() {	
		Random numAleatorio = new Random();
		int num = numAleatorio.nextInt(1,11);
		
		return num;
	}
	
	public static boolean esPar(int num) {
		boolean par =  false;
		
		if (num % 2 == 0) {
				par = true;
			}
		return par;
	}
}