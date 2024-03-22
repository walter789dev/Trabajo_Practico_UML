package punto_2;
import punto_2.enums.ClaseReserva;

public class UseReservaPasaje {

	public static void main(String[] args) {
		Avion av1 = new Avion("Persico-123", "kde1h5", 50, 300);
		Avion av2 = new Avion("Jalisco-567", "pkd2j4", 80, 200);
		
		Piloto pil1 = new Piloto(24904856, "Jose", "Hernandez", 45, "23/10/1985", "Comercial");
		Piloto pil2 = new Piloto(249034856, "Jose", "Hernandez", 44, "23/10/1984", "Comercial");
		
		Cliente cl1 = new Cliente(23098123, "Josema", "Estebes", 25, "12/11/1998", 3456, "correo1@gmail.com");
		Cliente cl2 = new Cliente(23098123, "Estefania", "Gonzales", 24, "12/11/1999", 3457, "correo2@gmail.com");
		
		Vuelo[] vuelos = {
			new Vuelo(av1, pil1, "Cordoba", "20/04/2024, 13:00hrs", "20/04/2024, 17:30hrs"),	
			new Vuelo(av2, pil2, "Chubut", "26/04/2024, 08:00hrs", "26/04/2024, 12:30hrs")
		};
		
		Reserva[] reservas = {
			new Reserva(cl1, "Cordoba", ClaseReserva.ECONOMICA),
			new Reserva(cl2, "Cordoba", ClaseReserva.EJECUTIVA),
			new Reserva(cl1, "Chubut", ClaseReserva.PRIMERA)
		};
		
		for (int i = 0; i < vuelos.length; i++) {
			Vuelo vuelo = vuelos[i];
			DetallesVuelo detalle = vuelo.getDetailsVuelo();
			for (int j = 0; j < reservas.length; j++) {
				Reserva reserva = reservas[j];
				
				if (detalle.getDestino().equals(reserva.getDestino())) {
					vuelo.addReserva(reserva);
					System.out.println("Se ha añadido reserva " + reserva.getIdReserva() + " al vuelo " + vuelo.getIdVuelo());
				}
			}
		}
		
		
	}

}
