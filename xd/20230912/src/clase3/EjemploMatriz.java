package clase3;

public class EjemploMatriz {

	public static void main(String[] args) {
		// int[][] matriz = new int[3][3];
		int[][] matriz = {{3,3,3},{4,5,7},{12,20,8}};
		//mostrarMatriz(matriz);
		//System.out.println(algunaFilaTodosImpares(matriz));	
		imprimirSoloFila(matriz,1);
		imprimirSoloFilasImpares(matriz);		
	}

	private static void imprimirSoloFilasImpares(int[][] matriz) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matriz.length; i++) {
			if(todosElementosImparesPorFila(matriz[i])) {
				imprimirSoloFila(matriz, i);
			}
		}
	}

	private static void imprimirSoloFila(int[][] matriz, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.print(matriz[i][j] + " ");
		}
	}

	private static boolean algunaFilaTodosImpares(int[][] matriz) {
		boolean rta = false;
		for (int i = 0; i < matriz.length; i++) {
			rta = rta || todosElementosImparesPorFila(matriz[i]);
		}
		return rta;
	}

	public static boolean todosElementosImparesPorFila(int[] fila) {
		boolean rta = true;
		for (int i = 0; i < fila.length; i++) {
			rta = rta && (fila[i]%2)!=0;
		}
		return rta;
	}

	private static void mostrarMatriz(int[][] matriz) {
		// TODO Auto-generated method stub
		// 3 3 6
		// 4 5 7
		// 12 20 8
		/*
		System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
		System.out.println(matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2]);
		System.out.println(matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2]);
		*/
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
}
