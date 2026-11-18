package aparcamientos;

public class Coche {
	
	private final String matricula;
	public final static int NUM_MIN_RUEDAS=2;
	private int km;
	
	public Coche(String matricula) {
		km=0;
		this.matricula=matricula;
		System.out.println("Se crea un coche.");
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int getKm() {
		return km;
	}
	
	public void circular(int distancia) {
		System.out.println("Un coche circula "+distancia+" km.");
		km=km+distancia;
	}

}
