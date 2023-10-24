package simulacro;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		int [] numeros = pedirNumeros();
		if(sonTodosMayoresA(numeros,30)) {
			System.out.println("Todos los numeros son mayores a 30");
		} else {
			System.out.println("No todos numeros son mayores a 30");
		}
	}

	private static boolean sonTodosMayoresA(int[] numeros, int n) {
		boolean rta = true;
		for (int i = 0; i < numeros.length; i++) {
			rta = rta && (numeros[i]>n);
		}
		return rta;
	}

	private static int[] pedirNumeros() {
		int[] numeros = new int[5];
		Scanner scaner = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese un numero ");
			numeros[i] = scaner.nextInt();
		}
		return numeros;
	}
}
