package ejercicio2;

public class Corredor <T>{
	private String nombre;
	private int posicion;
	private int tiempo;
	private T categoria;
	public Corredor(String nombre, int posicion, int tiempo, T categoria) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.tiempo = tiempo;
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", posicion=" + posicion + ", tiempo=" + tiempo + ", categoria="
				+ categoria + "]";
	}
	
}
