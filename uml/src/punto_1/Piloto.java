package punto_1;

public class Piloto extends Persona implements Volador{
	private int idPiloto, nroLicencia;
	private String tipoLicencia;
	private int experiencia;
	
	public Piloto() {}

	public Piloto(String nombre, String apellido, String domicilio, String fechaNacimiento, int edad, int idPiloto, int nroLicencia, String tipoLicencia, int experiencia) {
		super(nombre, apellido, domicilio, fechaNacimiento, edad);
		this.idPiloto = idPiloto;
		this.nroLicencia = nroLicencia;
		this.tipoLicencia = tipoLicencia;
		this.experiencia = experiencia;
	}
	
	@Override
	public void volar() {
		System.out.println("El piloto puede volar mediante un avion");
	}

	public int getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}

	public int getNroLicencia() {
		return nroLicencia;
	}

	public void setNroLicencia(int nroLicencia) {
		this.nroLicencia = nroLicencia;
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
}
