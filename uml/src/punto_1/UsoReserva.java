package punto_1;

public class UsoReserva {

	public static void main(String[] args) {
		Flota flota = new Flota("Aerolineas fugas");
		Avion avion1 = new Avion("K-03f", "f45h6", 50, 300);
		Avion avion2 = new Avion("K-20f", "f4556", 50, 250);
		
		flota.agregarAvion(avion1);
		flota.agregarAvion(avion2);
		
		Vuelo vuelo1 = new Vuelo("23456", "12:00", "20:00");
		Piloto piloto = new Piloto("Jose", "Altamirano", "Pedro Sances 200", "23/02/1990", 34, 23424, 2342342, "Comercial", 2);
		
		vuelo1.setPiloto(piloto);
		
		Reserva reserva1 = new Reserva(1243534, "Roberto Carlos", 50000);
		Reserva reserva2 = new Reserva(2093453, "Roberto Carlos", 50000);
		
		reserva1.agregarVuelo(vuelo1);
		reserva2.agregarVuelo(vuelo1);

	}

}
