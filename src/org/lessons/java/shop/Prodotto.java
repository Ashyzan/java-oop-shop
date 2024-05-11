package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
////	Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
//	
////	Usate opportunamente i livelli di accesso (public, private), 
//	i costruttori, i metodi getter e setter 
//	ed eventuali altri metodi di “utilità” per fare in modo che: 
//		- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random *
//		- il codice prodotto sia accessibile solo in lettura *
//		- gli altri attributi siano accessibili sia in lettura che in scrittura *
//		- il prodotto esponga un metodo per avere il prezzo base 
//		- il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
//		- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome 
//	
//	Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
//
//		//	BONUS: create un metodo (statico) che restituisca il codice con un pad left di 0 
//		per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, 
//  	mentre codice 123445567 resta come è)
//	
	
	// attributi classe
	private final int codice;
	
	private String nome;

	private String descrizione;
	
	private double prezzo;
	
	private static double iva = 0.22;
	
	private double prezzoIva;
	
	private String nomeEsteso;
	
	private static String codicePad;
	

// costruttore
public Prodotto( String nome , String descrizione , double prezzo)  {
	
	this.codice = numeroRandom();
	
	this.nome = nome;
	
	this.descrizione = descrizione;
	
	this.prezzo = setPrezzo(prezzo);
	
	this.prezzoIva = aggiungiIva(prezzo);
	
	this.nomeEsteso = nomeEstesoUser();
	
//	this.codicePad = pad();
	
	
	System.out.println("Sono il prodotto " + nome + ".\n"
			+ "Ecco le mie caratteristiche: \n" 
			+ "Descrizione: " + descrizione + "\n"
			+ "Codice " + codice + "\n" 
			+ "Il mio prezzo base è " + prezzo + "\n"
			+ "Il mio prezzo comprensivo di Iva è " + prezzoIva + "\n"
			+ "Il mio nome esteso è " + nomeEsteso + "\n"
			+ "Il mio codice PAD è " + codicePad + "\n");
}

// metodo numero random 
public int numeroRandom() { 
  
        // create random object 
        Random ran = new Random(); 
  
        // generating integer 
        int nxt = ran.nextInt(99999999); 
        
        return nxt;
     
} 


// metodo aggiungi iva e restituisci prezzo ivato

public double aggiungiIva(double prezzoPartenza) {
	
	double prezzoIvato = prezzoPartenza * iva + prezzoPartenza;
	return prezzoIvato;
}

// metodo nome esteso

public String nomeEstesoUser() {
	
	String codiceStringa =  codice + "";
	
	String nomeEstesoUtente = nome +  codiceStringa;
	return nomeEstesoUtente;
	
	
}

// BONUS Metodo PAD

//
//public String pad() {
//	
//	// BONUS:
//    // il codice che ha numero random è compreso fra 0 e 99999999. 
//    // devo passare il parametro random in un ciclo for (trasformando il numero in stringa?).
//    // ciclo for : se il numero alla posizione 1 è diverso da zero scrivilo, altirimenti scrivi zero.
//	
//	
//	String codiceStringa =  numeroRandom() + "";
//	
//	for (int i = 0; i < codiceStringa.length() ; i++) {
//		
//		String currentNum = codiceStringa[i];
//
//		if (i != 0) {
//			
//			System.out.print(i);
//			
//			}
//		
//		else {
//			System.out.print(0);
//			
//			}
//		}
//	
//		return currentNum ;
//		
//	
//	
//	}
//	


// metodo getter e setter 

	public int getCodice() {
		
		return codice;
	}
	
	public int setCodice( int codice) {
		
		return this.codice;
	
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

	public double getPrezzo() {
		return prezzo;
	}

	public double setPrezzo(double prezzoInserito) {
		
		if (prezzoInserito < 10) {
			this.prezzo = 0;
		}
		
		else {
			this.prezzo = prezzoInserito;
		}
		
		return prezzo;
		
	}

	public double getIva() {
		return iva;
	}


}