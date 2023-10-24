package progii;

public class Cliente {
	private String codigo;
	private String nombre;
	public Cliente(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
}
