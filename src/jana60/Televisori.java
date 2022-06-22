package jana60;

public class Televisori extends Prodotto{

	private int dimensione;
	
	private boolean smart;

	public Televisori(int codice, String nome, String marca, double prezzo, int iva, int dimensione, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensione = dimensione;
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Dimensione: " + dimensione + " pollici" + "; smart: " + smart; 
	}
	
}
