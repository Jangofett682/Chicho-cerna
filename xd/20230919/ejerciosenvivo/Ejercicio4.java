package simulacro;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[][] matriz = cargarMatriz();
		if(algunaFilaTodosMenoresA(matriz,20)) {
			System.out.println("alguna Fila con Todos Menores a 20");
		} else {
			System.out.println("Ninguna Fila con Todos Menores a 20");
		}
	}

	private static boolean algunaFilaTodosMenoresA(int[][] matriz, int n) {
		boolean rta = false;
		for (int i = 0; i < matriz.length; i++) {
			rta = rta || filaTodosMenoresA(matriz[i],n);
		}
		return rta;
	}

	private static boolean filaTodosMenoresA(int[] fila, int n) {
		boolean rta = true;
		for (int i = 0; i < fila.length; i++) {
			rta = rta && (fila[i]<n);
		}
		return rta;
	}

	private static int[][] cargarMatriz() {
		// hardcodeo
		int[][] matriz = {{52,54,55,56,58},
				{2,4,5,6,8},
				{52,54,55,56,58},
				{52,54,55,56,58},
				{52,54,55,56,58},
				{52,54,55,56,58}};
		return matriz;
	}
}
