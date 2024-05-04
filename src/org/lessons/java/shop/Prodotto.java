package org.lessons.java.shop;

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
	
	private double iva;

// costruttore
public Prodotto( int codice , String nome , String descrizione , double prezzo , double iva)  {
	
	this.codice = (int)Math.random() * 5;
	
	this.nome = nome;
	
	this.descrizione = descrizione;
	
	this.prezzo = prezzo;
	
	this.iva = iva;
}

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

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	// metodo per prezzo base
	
	public double basePrice(double prezzo) {
		
		 this.prezzo = 20.00;
		
		
	}


}