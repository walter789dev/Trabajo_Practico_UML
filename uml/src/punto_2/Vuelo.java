package punto_2;
import java.util.ArrayList;
import punto_2.enums.EstadoVuelo;

public class Vuelo {
	private int idVuelo;
	private Avion avion;
	private DetallesVuelo detailsVuelo;
	private Piloto piloto;
	private ArrayList<Reserva> reservas;
	private EstadoVuelo estado;
	

	private static int next_id = 1000;
	
	public Vuelo() {}

	public Vuelo(Avion avion, Piloto piloto, String destino, String salida, String llegada) {
		this.idVuelo = Vuelo.next_id;
		this.detailsVuelo = new DetallesVuelo(destino, salida, llegada);
		this.reservas = new ArrayList<Reserva>();
		this.estado = EstadoVuelo.PROGRAMADO;
		this.avion = avion;
		this.piloto = piloto;
		
		Vuelo.next_id++;
	}
	
	public int getIdVuelo() {
		return idVuelo;
	}

	public EstadoVuelo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVuelo estado) {
		this.estado = estado;
	}
	
	public Avion getAvion() {
		return avion;
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

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	
	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public DetallesVuelo getDetailsVuelo() {
		return detailsVuelo;
	}
	
	public void setDetailsVuelo(DetallesVuelo detailsVuelo) {
		this.detailsVuelo = detailsVuelo;
	}
}

