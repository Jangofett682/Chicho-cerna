package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Campeonato <T>{
	private List<Corredor <T>> corredores = new ArrayList<>();
	public void agregarCorredor(Corredor<T> corredor) {
		corredores.add(corredor);
	}
	@Override
	public String toString() {
		return "Campeonato [corredores=" + corredores + "]";
	}
	
}
