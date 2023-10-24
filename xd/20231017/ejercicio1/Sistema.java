package ejercicio1;
import java.util.ArrayList;
import java.util.List;
public class Sistema {
	private String nombre;
	private List<Cliente> clientes = new ArrayList<>();
	public Sistema(String nombre) {
		this.nombre = nombre;
	}
	public void agregarCliente(Cliente cliente) {
		if(clientes.size()>10) {
			throw new RuntimeException("Hasta 10 clientes");
		}
		clientes.add(cliente);
	}
	@Override
	public String toString() {
		return "Sistema [nombre=" + nombre + ", clientes=" + clientes + "]";
	}
	
}
