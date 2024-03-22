package punto_1;

public class Vuelo {
	private String codVuelo;
	private String horarioSalida, horarioLlegada;
	private Piloto piloto;
	private Avion avion;
	
	public Vuelo(String codVuelo, String horarioSalida, String horarioLlegada) {
		this.codVuelo = codVuelo;
		this.horarioSalida = horarioSalida;
		this.horarioLlegada = horarioLlegada;
	}
	
	public String getCodVuelo() {
		return codVuelo;
	}

	public void setCodVuelo(String codVuelo) {
		this.codVuelo = codVuelo;
	}

	public String getAvion() {
		return avion.getNombre();
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public String getHorarioSalida() {
		return horarioSalida;
	}

	public void setHorarioSalida(String horarioSalida) {
		this.horarioSalida = horarioSalida;
	}

	public String getHorarioLlegada() {
		return horarioLlegada;
	}

	public void setHorarioLlegada(String horarioLlegada) {
		this.horarioLlegada = horarioLlegada;
	}

}
