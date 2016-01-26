/*
Classe Impiegato che lo rappresenti tramite nome e stipendio con 
un costruttore che inizializzi nome e stipendio, con opportuni metodi 
di get sugli attributi e con un metodo per aumentarne lo stipendio
*/

import java.util.Scanner;

public class Impiegato {


/*---------ATTRIBUTI---------------*/
	String nome;
	String cognome;
	int stipendio;
	
/*----------------COSTRUTTORE-----------------------------*/
	public Impiegato(String nome, String cognome,int stipendio)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.stipendio=stipendio;
	}
/*------METODI------------*/

public String getNome()
{return nome;}

public String getCognome()
{ return cognome;}

public int setStipendio()
{ return stipendio; }

public void getStipendio(int aumentaStipendio)
{ stipendio += aumentaStipendio;}

public void stampaStato()
	{
	System.out.println("Nome: "+nome+"\nCognome: "+cognome+"\nEta: "+stipendio);
	}




}
