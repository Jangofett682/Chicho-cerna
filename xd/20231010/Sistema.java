package progii_ejercicio;

public class Sistema {
	private String descripcion;
	private String fecha;
	private Cliente[] clientes = new Cliente[5];
	
	public Sistema(String descripcion,String fecha) {
		this.descripcion = descripcion;
		this.fecha = fecha;
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
		}
	}
	
	public Sistema() {
		// TODO Auto-generated constructor stub
	}

	public boolean agregarCliente(Cliente cliente) {
		// completar
		return false;
	}
	
	public boolean quitarCliente(String nombre, String apellido) {
		// completar
		return false;
	}
	
}
