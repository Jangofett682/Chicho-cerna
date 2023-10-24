package clase2;
public class Ejercicio1 {
	public static void main(String[] args) {
		int[] numeros = {5,11};
		if (determinarSiHayUnPar(numeros)) {
			System.out.println("Hay un numero par");
		} else {
			System.out.println("No hay numero par");
		}
	}

	// acumuladores booleanos
	// tabla de verdad
	// true || true => true
	// true || false => true
	// false || true => true
	// false || false => false
	public static boolean determinarSiHayUnPar(int[] numeros) {
		boolean rta = false;
		for (int i = 0; i < numeros.length; i++) {
			rta = rta || ((numeros[i]%2)==0);
			/*
			if(numeros[i]%2==0) {
				rta = true;
			}
			*/
		}
		return rta;
	}

	// acumuladores booleanos
	// tabla de verdad
	// true && true => true
	// false && true => false
	// true && false => false
	// false && false => false
	public static boolean determinarSiTodosSonPares(int[] numeros) {
		boolean rta = true;
		for (int i = 0; i < numeros.length; i++) {
			rta = rta && numeros[i]%2==0;
		}
		return rta;		
	}

}
