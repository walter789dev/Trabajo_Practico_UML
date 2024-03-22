package punto_2;
import punto_2.abstracts.Persona;

public class Cliente extends Persona {
	private int idCliente, nroPasaporte;
	private String correo;
	private static int next_id = 200;
	
	public Cliente() {}

	public Cliente(int dni, String nombre, String apellido, int edad, String fechaNacimiento,
			int nroPasaporte, String correo) {
		super(dni, nombre, apellido, edad, fechaNacimiento);
		this.idCliente = Cliente.next_id;
		this.nroPasaporte = nroPasaporte;
		this.correo = correo;
		
		Cliente.next_id++;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public int getNroPasaporte() {
		return nroPasaporte;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
