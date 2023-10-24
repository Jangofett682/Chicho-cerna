package simulacro;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int num1 = pedirNumero("Ingrese primer numero");
		int num2 = pedirNumero("Ingrese segundo numero");
		if(num1 > num2) {
			System.out.println("Numero " + num1 + "es mayor");
		} else {
			System.out.println("Numero " + num2 + "es mayor");
		}
	}
	private static int pedirNumero(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextInt();
	}
	
}
