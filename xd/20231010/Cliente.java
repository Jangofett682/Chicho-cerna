package progii_ejercicio;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private String[] telefonos = new String[3];
	
	public Cliente(String nombre, String apellido, 
			int edad, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefonos[0] = telefono;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public boolean agregarTelefono(String telefono) {
		for (int i = 0; i < telefonos.length; i++) {
			if(telefonos[i]==null) {
				telefonos[i]= telefono;
			}
		}
		return false;
	}
}
