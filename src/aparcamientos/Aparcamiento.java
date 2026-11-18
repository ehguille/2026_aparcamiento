package aparcamientos;

public class Aparcamiento {
	
	public static final int PLAZAS_CAPACIDAD=5;

	public Ticket registrar(Coche unCoche) {
		System.out.println("Se registra un coche: "+unCoche.getMatricula()+" "+c.getKm()+" km.");
		return emitirTicket();
	}
	
	
	public Ticket emitirTicket() {
		System.out.println("Se emite un Ticket.");
		Ticket t = new Ticket();
		return t;
	}
}
