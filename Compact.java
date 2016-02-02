/*

Scrivere una classe  che rappresenti un compact disc tramite gli attributi opportuni:
titolo, autore, anno di uscita e elenco delle canzoni. 

Creare un costruttore che inizializzi tutti gli attributi con 
passaggio di parametri
e un costruttore che prenda il numero delle 
tracce in input e inizializzi l'attributo canzoni in automatico 
(ad esempio le tracce avranno nome del tipo: Track1, Track2 etc)

Scrivere i metodi:
get e set delle variabili istanza
un metodo per la stampa dello stato degli attributi
un metodo che trova il numero della traccia dato il nome
Scrivere un main per testare la classe in modo da usare i due costruttori, 
il metodo stampa e il metodo di ricerca della traccia
*/


import java.util.Scanner;

public class Compact {


//------attributi
	String titolo;
	String autore;
	int anno;
	int numero;
	String [] canzoni;
	String [] canzoniCostDue;
	
//------costruttore Uno
	public Compact(String titoloP, String autoreP, int annoP, String [] canzoniP){

	titolo = titoloP;
	autore = autoreP;
	anno = annoP;
	canzoni = canzoniP;

	}


//------costruttore Due
	public Compact(int numeroP){

	numero =numeroP;
	
	titolo = "fabry";
	autore = "priami";
	anno = 2016;
	
	canzoniCostDue = new String[numeroP];
	}
	
	
	public String getTitolo()
	{ return titolo;}

	public String getAutore()
	{ return autore;}

	public int getAnno()
	{ return anno;}

	
	
//--------popola l'array due per il costruttore due	
	public void setTracce()
	{
	for (int i = 0; i < canzoniCostDue.length; i++)
		{
			int tempI = i + 1;
			String temp = "Track " + tempI;
			canzoniCostDue[i] = temp;
		}	
	}


//-----------cerca la traccia all'interno dell'array del costruttore uno	
	public int setCercaTracce(String nomeTraccia)
	{
		
		for (int i = 0; i < canzoni.length; i++)
			{
				int tempI = i +1;
			if (nomeTraccia.equals(canzoni[i]))
				{return tempI;}
			}
		return -1;
	}

//-----------cerca la traccia all'interno dell'array del costruttore due	
	public int setTracceDue(String nomeTraccia)
	{
		
		for (int i = 0; i < canzoniCostDue.length; i++)
			{
				int tempI = i +1;
			if (nomeTraccia.equals(canzoniCostDue[i]))
				{return tempI;}
			}
		return -1;
	}
	
	
//--------------due metodi stampa per il costruttire uno e due
	public void stampa()
	{
		System.out.println("Titolo " + titolo + "\nAutore " + autore + "\nAnno " + anno );
	for(int i = 0; i < canzoni.length; i++)
		{
		System.out.println("Traccia: " + canzoni[i]);
		}	
	}
	
	public void stampaCostDue()
	{
	System.out.println("Titolo " + titolo + "\nAutore " + autore + "\nAnno " + anno );
	
	for(int i = 0; i < canzoniCostDue.length; i++)
		{
		System.out.println("Traccia: " + canzoniCostDue[i]);
		}	
	}





public static void main  (String [] args){
		
		Scanner input = new Scanner(System.in);	
		
		 
// costruttore uno------------------------------------------------
		String [] arr = {"x","y","z"}; 
		 
		
		Compact Cd = new Compact ("faby", "cd", 2016, arr);
		
		System.out.println("CD 1");
		System.out.println();
		
		Cd.stampa();
	
//---------metodo di ricerca della traccia per tutti e due i costruttori	
		System.out.println("che traccia stai cercando?");
		
		int temp = Cd.setCercaTracce(input.nextLine());
		


//-----------controllo se la traccia non c'è nell'elenco		
		while (temp == -1)
		{
			System.out.println("traccia non trovata");
			System.out.println();
			
			Cd.stampa();
				
			System.out.println("che traccia stai cercando?");
			temp = Cd.setCercaTracce(input.nextLine());
		
		}
		
			
			if (temp != -1)
			{
				System.out.println("ok la traccia e' la num : " + temp);
			}
//---------------------------------------------------------------------	

	
// costruttire due------------------------------------------------		
		System.out.println("CD 2");
		System.out.println("quante tracce ha il cd 2 ? ");
		
			int Comapact2 = input.nextInt();

//-------------controllo sul valore dell'input		
		
		while (Comapact2 == 0)
		{
			
			System.out.println("numero non valido");
			System.out.println();
			System.out.println("quante tracce ha il cd 2 ? ");
		
		Comapact2 = input.nextInt();
		}


		
		Compact Cd2 = new Compact(Comapact2);
		
		Cd2.setTracce();
		Cd2.stampaCostDue();
		
			System.out.println("che traccia stai cercando?");
		
		input.nextLine(); // serve solo perchè senza salta la variabile temp e va direttametne al while
		temp = Cd2.setTracceDue(input.nextLine());
		
		while (temp == -1)
		{
			System.out.println("traccia non trovata");
			System.out.println();
			
			Cd2.stampaCostDue();
				
			System.out.println("che traccia stai cercando?");
			temp = Cd2.setTracceDue(input.nextLine());
		
		}
		
			
			if (temp != -1)
			{
				System.out.println("ok la traccia e' la num : " + temp);
			}
	}


}
