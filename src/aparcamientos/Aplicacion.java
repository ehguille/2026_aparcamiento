package aparcamientos;

public class Aplicacion {
	
	public Aplicacion() {
		System.out.println("Capacidad del aparcamiento="+Aparcamiento.PLAZAS_CAPACIDAD);
		Aparcamiento a=new Aparcamiento();
		
		Coche c1=new Coche("1234BCD");
		Coche c2=new Coche("6789XYZ");
		
		a.registrar(c1);
		a.registrar(c2);
		
		c1.circular(100);
		
		System.out.println(c1.getKm()+" km.");
		System.out.println(c2.getKm()+" km.");

		System.out.println(a.emitirTicket().getNumeroTicketActual());
		System.out.println(a.emitirTicket().getNumeroTicketActual());
		System.out.println(a.emitirTicket().getNumeroTicketActual());
		
		System.out.println(Ticket.getNumeroTicketsEmitidos());
	
	}

	public static void main(String[] args) {
		Aplicacion a = new Aplicacion();
	}

}
