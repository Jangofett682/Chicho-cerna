package clase2;
public class Ejercicio1 {
	public static void main(String[] args) {
		int[] numeros = {5,11};
		if (determinarSiHayPar(numeros)) {
			System.out.println("Hay un numero par");
		} else {
			System.out.println("No hay numero par");
		}
	}
	public static boolean determinarSiHayPar(int[] numeros) {
		boolean rta = false;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]%2==0) {
				rta = true;
			}
		}
		return rta;
	}

}
