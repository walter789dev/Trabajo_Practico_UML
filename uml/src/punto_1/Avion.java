package punto_1;

public class Avion {
	private String nombre, matricula;
	private int cantidadAsientos;
	private double capacidadCarga;
	private boolean estado;
	
	public Avion() {}
	
	public Avion(String nombre, String matricula, int cantidadAsientos, double capacidadCarga) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.cantidadAsientos = cantidadAsientos;
		this.capacidadCarga = capacidadCarga;
	}
	
	public void volar() {
		if(!estado) {
			System.out.println("El avion va a despegar");
			estado = true;
		}
		else 
			System.out.println("El avion se encuentra volando");
	}
	
	public void aterrizar() {
		if(estado) {
			System.out.println("El avion va a aterrizar");
			estado = false;
		}
		else 
			System.out.println("El avion ya ha aterrizado");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
}
