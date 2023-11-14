package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		boolean memoria = false;
		boolean wireOcabla = false;
		
		Prodotto[] p = new Prodotto[5];
		int i = 0;
		
		String strCodiceImei = null;
		int intMemoria = 0;
		
		int intDimensioni = 0;
		String strSmart = null;
		
		String strColore = null;
		String strWirless = null;
		
		
		while (true) {

			Scanner in = new Scanner(System.in);
			
			System.out.print("Vuoi inserire un nuovo prodotto? ");
			String strProdotto = in.nextLine();
			
			if (strProdotto.equals("no")) break;
			
			System.out.print("Inserisci codice prodotto: ");
			String strCodice = in.nextLine();
			int intCodice = Integer.valueOf(strCodice);
			
			System.out.print("Inserisci NOME prodotto: ");
			String strNome = in.nextLine();
			
			System.out.print("Inserisci DESCRIZIONE prodotto: ");
			String strDescrizione = in.nextLine();
			
			System.out.print("Inserisci PREZZO prodotto: ");
			String strPrezzo = in.nextLine();
			int intPrezzo = Integer.valueOf(strPrezzo);
			
			System.out.print("Inserisci IVA prodotto: ");
			String strIva = in.nextLine();
			int intIva = Integer.valueOf(strIva);
			
			System.out.print("Che tipo di prodotto vuoi inserire? (smartphone, televisori, cuffie) ");
			String strTipo = in.nextLine().toLowerCase();
			
			
			if (strTipo.equals("smartphone")) {
				
				System.out.print("Inserisci codice IMEI: ");
				strCodiceImei = in.nextLine();
				
				System.out.print("Inserisci memoria: ");
				String strMemoria = in.nextLine();
				intMemoria = Integer.valueOf(strMemoria);
				
				
			}
			
			if (strTipo.equals("televisori")) {
				
				System.out.print("Inserisci dimensioni: ");
				String strDimensioni = in.nextLine();
				intDimensioni = Integer.valueOf(strDimensioni);
				
				System.out.print("E' Smart? ");
				strSmart = in.nextLine();
				
				if (strSmart.equals("si")) {
					memoria = true;
				}
				
			}
			
			if (strTipo.equals("cuffie")) {
				
				System.out.print("Inserisci il colore: ");
				strColore = in.nextLine();
				
				System.out.print("E' Wirless? ");
				strWirless = in.nextLine();
				
				if (strWirless.equals("si")) {
					wireOcabla = true;
				}
				
				in.close();
				
			}
			
            
            switch (strTipo) {
              case "smartphone": {
                  
                  p[i] = new Smartphone(intCodice, strNome, strDescrizione, intPrezzo, intIva, strCodiceImei, intMemoria);
                  i++;
                  break;
              }
              case "televisori": {
            	  p[i] = new Televisori(intCodice, strNome, strDescrizione, intPrezzo, intIva, intDimensioni, memoria);
            	  i++;
            	  break;
              }
              case "cuffie": {
            	  p[i] = new Cuffie(intCodice, strNome, strDescrizione, intPrezzo, intIva, strColore, wireOcabla);
            	  i++;
            	  break;
              }
              default:
                  throw new IllegalArgumentException("Unexpected value: " +strTipo);
                  
              }
          
              
    
          }
      
        for (int j = 0; j <i; j++) {
              System.out.println(p[j] + "\n");
          }
			
	}
		
}


