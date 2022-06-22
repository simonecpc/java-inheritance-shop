package jana60;

public class Cuffie extends Prodotto{

	private String colore;
	
	private boolean wireless;

	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Colore: " + colore + "; wireless: " + wireless; 
	}
	
}
