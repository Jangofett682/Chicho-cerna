package ejercicio1;

public class Cliente {
	private String apellido;
	private String dni;
	public Cliente(String dni,String apellido) {
		if(dni.equals("")) 
			throw new RuntimeException("apellido vacio");
		this.apellido = apellido;
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", dni=" + dni + "]";
	}
	
}
