package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wOc;
	
	public Cuffie(int codice, String nome, String descrizione, float prezzo, int iva, String colore, boolean wOc) {
		
		super(codice, nome, descrizione, prezzo, iva);
		
		setColore(colore);
		
		setWirlessCablate(wOc);
		
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWirlessCablate() {
		return wOc;
	}

	public void setWirlessCablate(boolean wOc) {
		this.wOc = wOc;
	}
	
	public String wirlessCable() {
		return isWirlessCablate() ? "Wireless" : "Cablate";
	}
	
	@Override
	public String toString() {
		
		return super.toString() 
				+ "Colore: " + getColore() + "\n"
				+ "Wirless o Cablate: " + wirlessCable() + "\n";
	}
}
