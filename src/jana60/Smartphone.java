package jana60;

public class Smartphone extends Prodotto{

	private String imei;
	
	private int memoria;

	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, String codeIMEI, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.imei = codeIMEI;
		this.memoria = memoria;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + imei + "; Memoria: " + memoria; 
	}
	
}
