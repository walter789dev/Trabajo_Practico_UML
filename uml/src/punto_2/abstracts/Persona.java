package punto_2.abstracts;

public abstract class Persona {
	private int dni, edad;
	private String nombre, apellido;
	private String fechaNacimiento;
	
	public Persona() {}

	public Persona(int dni, String nombre, String apellido, int edad, String fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getInfoPersona() {
		return "Dni: " + dni + ", Nombre: " + nombre + ", Apellido: " + apellido
				+ ", Edad: " + edad + ", Fecha de Nacimiento: " + fechaNacimiento;
	}
	
	public int getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
}
