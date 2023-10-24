package ejercicio2;

public class App {
	public static void main(String[] args) {
		Campeonato campeonato = new Campeonato<>();
		Corredor corredor1 = 
				new Corredor<Integer>("Pedro", 5, 50, 3);
		Corredor corredor2 = 
				new Corredor<Integer>("Joy", 2, 50, 3);
		Corredor corredor3 = 
				new Corredor<Integer>("Julia", 3, 50, 3);
		campeonato.agregarCorredor(corredor1);
		campeonato.agregarCorredor(corredor2);
		campeonato.agregarCorredor(corredor3);
		System.out.println(campeonato);
		
	}
}
