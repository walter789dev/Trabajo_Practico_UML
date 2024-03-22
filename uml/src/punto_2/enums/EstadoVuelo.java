package punto_2.enums;

public enum EstadoVuelo {
	EN_CURSO("En curso"),
	PROGRAMADO("Vuelo Programado"),
	COMPLETADO("Vuelo Completado"),
	CANCELADO("Vuelo Cancelado");
	
	private String estado;
	
	private EstadoVuelo(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return estado;
	}
}
