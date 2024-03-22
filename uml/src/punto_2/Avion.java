package punto_2;

public class Avion {
	private int idAvion, cantAsientos;
	private String nombre, matricula;
	private double capacidadCarga;
	private static int next_id = 1000;
	
	public Avion() {}

	public Avion(String nombre, String matricula, int cantAsientos, double capacidadCarga) {
		this.idAvion = Avion.next_id;
		this.nombre = nombre;
		this.matricula = matricula;
		this.cantAsientos = cantAsientos;
		this.capacidadCarga = capacidadCarga;
		
		Avion.next_id++;
	}

	public int getIdAvion() {
		return idAvion;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantAsientos() {
		return cantAsientos;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}
}
