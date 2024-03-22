package punto_2.enums;

public enum EstadoReserva {
	PENDIENTE("Pendiente"),
	CONFIRMADO("Confirmado"),
	CANCELADO("Cancelado");
	
	private final String estado;
	
	private EstadoReserva(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return estado;
	}
}
