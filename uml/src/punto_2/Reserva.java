package punto_2;
import punto_2.enums.ClaseReserva;
import punto_2.enums.EstadoReserva;

public class Reserva {
	private static int next_id = 1;
	private int idReserva;
	private Cliente cliente;
	private String destino;
	private double precio;
	private EstadoReserva estado;
	private ClaseReserva clase;
	
	public Reserva() {}

	public Reserva(Cliente cliente, String destino, ClaseReserva clase) {
		this.idReserva = Reserva.next_id;
		this.cliente = cliente;
		this.destino = destino;
		this.estado = EstadoReserva.PENDIENTE;
		setClase(clase);
		
		Reserva.next_id++;
	}
	
	public int getIdReserva() {
		return idReserva;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPrecio() {
		return precio;
	}

	public EstadoReserva getEstado() {
		return estado;
	}

	public void setEstado(EstadoReserva estado) {
		this.estado = estado;
	}
	
	public ClaseReserva getClase() {
		return clase;
	}

	public void setClase(ClaseReserva clase) {
		switch (clase) {
			case ECONOMICA: {
				this.precio = 20000;
				this.clase = ClaseReserva.ECONOMICA;
				break;
			}
			case EJECUTIVA: {
				this.precio = 28000;
				this.clase = ClaseReserva.EJECUTIVA;
				break;
			}
			case PRIMERA: {
				this.precio = 35000;
				this.clase = ClaseReserva.PRIMERA;
				break;
			}
			default: System.out.println("Opcion invalida");
		}
	}

}
