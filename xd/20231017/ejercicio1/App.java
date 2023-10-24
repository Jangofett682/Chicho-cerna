package ejercicio1;

public class App {
	public static void main(String[] args) {
		Sistema sistema = new Sistema("Mi sistema");
		sistema.agregarCliente(new Cliente("2222","Juan"));
		// camino alternativo
		//sistema.agregarCliente(new Cliente("",""));
		System.out.println(sistema);
	}
}
