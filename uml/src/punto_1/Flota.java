package punto_1;
import java.util.ArrayList;
import java.util.List;

public class Flota {
	private String nombreFlota;
	private List<Avion> aviones;
	
	public Flota(String nombreFlota) {
		this.nombreFlota = nombreFlota;
		aviones = new ArrayList<Avion>();
	}

	public String getNombreFlota() {
		return nombreFlota;
	}

	public void setNombreFlota(String nombreFlota) {
		this.nombreFlota = nombreFlota;
	}
	
	public void agregarAvion(Avion av) {
		aviones.add(av);
	}
	
	public void eliminarAvion(Avion av) {
		aviones.remove(av);
	}
	
	public void getAviones() {
		for (Avion avion : aviones) {
			System.out.println(avion.getNombre());
		}
	}
}
