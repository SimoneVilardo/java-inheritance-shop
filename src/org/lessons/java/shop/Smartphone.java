package org.lessons.java.shop;

public class Smartphone extends Prodotto{
	
		
		private String codiceImei;
		private int memoria;
		
		public Smartphone(int codice, String nome, String descrizione, float prezzo, int iva, boolean fedelta, String codiceImei, int memoria) {
			
			super(codice, nome, descrizione, prezzo, iva, fedelta);
			
			setCodiceImei(codiceImei);
			
			setMemoria(memoria);
			
		}

		public String getCodiceImei() {
			return codiceImei;
		}

		public void setCodiceImei(String codiceImei) {
			this.codiceImei = codiceImei;
		}

		public int getMemoria() {
			return memoria;
		}

		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}
		
		@Override
		public String toString() {
		
		 return super.toString() 
				 + "Memoria: " + getMemoria() + "gb" + "\n" 
				 + "Codice IMEI: " + getCodiceImei()+ "\n";
		}
}
