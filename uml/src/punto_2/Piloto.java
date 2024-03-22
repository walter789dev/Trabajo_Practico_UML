package punto_2;

import punto_2.abstracts.Persona;

public class Piloto extends Persona{
	private int idPiloto;
	private String licencia;
	private static int next_id = 500;
	
	public Piloto() {}

	public Piloto(int dni, String nombre, String apellido, int edad, String fechaNacimiento, 
			String licencia) {
		super(dni, nombre, apellido, edad, fechaNacimiento);
		this.idPiloto = Piloto.next_id;
		this.licencia = licencia;
		
		Piloto.next_id++;
	}

	public int getIdPiloto() {
		return idPiloto;
	}
	
	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
}
