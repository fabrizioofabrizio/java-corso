/*
Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
Il programma deve essere in grado di effettuare versamenti, 
prelievi, di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti  
*/

public class ContoCorrente {
	
//-----ATTRIBUTI

	String cognome;
	String nome;
	int versamenti;
	int prelievi;
	int saldo;

//-----COSTRUTTORE

	public ContoCorrente (String nome, String cognome, int saldo)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.saldo = saldo;
	}

//*----METODI--------------------------------------------------------------	
	public String getNome()
	{
		return nome;
	}
	
	public String getCognome ()
	{
		return cognome;
	}
	
	public int getVersamenti()
	{
		return versamenti;
	}
	
	
	public int getPrelievi(int Prel)
	{
		return saldo = saldo - Prel;
	}
	
	public int getVersamenti(int Vers)
	{
		return saldo = saldo + Vers;
	}
	
	public void stampaConto()
	{
		System.out.println("Nome: " + nome + "\nCognome: " + cognome + "\nSaldo: " + saldo  );
	}
	
}






















