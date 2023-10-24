package simulacro;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		if(acerto(pedirNumero("ingrese un numero"))) {
			System.out.println("Acerto");
		} else {
			System.out.println("No Acerto");
		}
	}
	private static boolean acerto(int pedirNumero) {
		Random random = new Random();
		return (pedirNumero==random.nextInt(10)+1);
	}
	private static int pedirNumero(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextInt();
	}
}
