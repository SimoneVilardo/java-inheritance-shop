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
		
		boolean fedelta = false;

		Scanner in = new Scanner(System.in);
		
        System.out.println("Hai la tessera fedeltà? si/no");
        fedelta = in.nextLine().equalsIgnoreCase("si");
		
		
		while (true) {

			
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
				
				
			}
			
            
            switch (strTipo) {
              case "smartphone": {
                  
                  p[i] = new Smartphone(intCodice, strNome, strDescrizione, intPrezzo, intIva, fedelta, strCodiceImei, intMemoria);
                  i++;
                  break;
              }
              case "televisori": {
            	  p[i] = new Televisori(intCodice, strNome, strDescrizione, intPrezzo, intIva, fedelta, intDimensioni, memoria);
            	  i++;
            	  break;
              }
              case "cuffie": {
            	  p[i] = new Cuffie(intCodice, strNome, strDescrizione, intPrezzo, intIva, fedelta, strColore, wireOcabla);
            	  i++;
            	  break;
              }
              default:
                  throw new IllegalArgumentException("Unexpected value: " +strTipo);
                  
              }
          
              
    
          }
      
		double prezzoTotale = 0;

        for (int x=0; x < i; x++) {
            System.out.println(p[x]);

            if(fedelta) {
            prezzoTotale += p[x].getPrezzoScontato();
            } else {
                prezzoTotale += p[x].getPrezzoIntero();
            }

        }

        System.out.println("Il prezzo totale è: " + String.format("%.2f", prezzoTotale) + "€");

	}
		
}


