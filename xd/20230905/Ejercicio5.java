package clase2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numAleatorio = random.nextInt(10)+1;
		System.out.println(numAleatorio);
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese un numero");
			int numero = scanner.nextInt();
			if(numAleatorio==numero) {
				System.out.println("Acerto "+ numero);
				break;
			} else {
				System.out.println("No Acerto "+ numero);
			}
		}
		scanner.close();
	}
}
