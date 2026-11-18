package aparcamientos;

public class Ticket {
	
	private static int contadorTickets=0;
	private int numeroTicketActual;
	
	public Ticket() {
		numeroTicketActual=contadorTickets;
		contadorTickets++;
		System.out.println("Se crea un Ticket.");
	}
	
	public int getNumeroTicketActual() {
		return numeroTicketActual;
	}
	
	public static int getNumeroTicketsEmitidos() {
		return contadorTickets;
	}

}
