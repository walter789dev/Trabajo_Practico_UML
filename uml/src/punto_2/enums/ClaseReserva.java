package punto_2.enums;

public enum ClaseReserva {
	ECONOMICA("Clase Economica"),
	EJECUTIVA("Clase Ejecutiva"),
	PRIMERA("Primera Clase");
	
	private final String clase;
	
	private ClaseReserva(String clase) {
		this.clase = clase;
	}
	
	@Override
	public String toString() {
		return clase;
	}
}
