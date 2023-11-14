package org.lessons.java.shop;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
		
		setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setIva(iva);	
		
	}
	
   public int getCodice() {
        return codice;
        
    }

    private void setCodice(int codice) {
 	    this.codice = codice;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getDescrizione() {
        return descrizione;
    }
    
    public void setDescrizione(String descrizione) {
    	this.descrizione = descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }
    
    public void setPrezzo(float prezzo) {
    	this.prezzo = prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
    	this.iva = iva;
    }
    
    
    public float getPrezzoIntero() {

        return prezzo * (100 + iva) / 100;
    }
    
    
    public String getCodiceModificato() {
        return String.format("%08d", codice);
    }
    
    public String getNomeCompleto( ) {
    	return getCodiceModificato() +"-"+ getNome();
    }

    @Override
    public String toString() {
    	
    	return "Codice Prodotto: " + getCodiceModificato() + "\n"
    			+ "Nome Prodotto: " + getNome() + "\n"
    			+ "Descrizione: " + getDescrizione() + "\n"
    			+ "---------------------------------\n"
    			+ "Prezzo Iniziale: " + String.format("%.02f", getPrezzo()) + "€\n"
    			+ "Iva Imposta: " + getIva() + "%\n"
    			+ "---------------------------\n"
    			+ "Nome Completo Prodotto: " + getNomeCompleto() +"\n"
    			+ "Prezzo Finale: " + String.format("%.02f", getPrezzoIntero()) + "€" + "\n"
    			+"---------------------------------\n";
    }
	
}
