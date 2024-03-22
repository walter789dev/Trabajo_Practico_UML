package punto_1;

public class Reserva {
	private int idReserva;
	private String cliente;
	private double precio;
	private Vuelo vuelo;
	
	public Reserva() {}
	
	public Reserva(int idReserva, String cliente, double precio) {
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.precio = precio;
	}
	
	public void reservarVuelo(Vuelo vl) {
		vuelo = vl;
	}
	
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public String getCliente() {
		return cliente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void agregarVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
}
