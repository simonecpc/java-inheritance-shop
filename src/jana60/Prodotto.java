package jana60;

import java.text.DecimalFormat;

public class Prodotto {

	private int codice;
	
	private String nome;
	
	private String marca;
	
	private double prezzo;
	
	private int iva;

	DecimalFormat d = new DecimalFormat ("#.00€");
	
	public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public double prezzoFinale () {
		return prezzo + (prezzo/100 * iva);
	}
	
	public String prezzoFormattato () {
		return d.format(prezzoFinale());
	}
	
	@Override
	public String toString() {
		return "Codice :" + codice + "; Nome:" + marca + " " + nome + ";prezzo formattato:" + prezzoFormattato() + ";";
	}
	
}
