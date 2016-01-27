/*
Scrivere un metodo 
main
(all'interno di una delle 2 classi...) che 
testi il funzionamento degli oggetti e dei  metodi scritti (Es. creare 
ufficio con n impiegati, stampare l'ufficio, aumentare lo stipendio di un 
impiegato con nom
e passato da input da tastiera )
*/
import java.util.Scanner;


public class testaUfficio {
	
	public static void main  (String [] args){
	
	Impiegato [] arrUff = {
	new Impiegato ("fabry", "priami", 1000),
	new Impiegato ("massy", "russo", 2000),
	new Impiegato ("simo", "renna", 3000)
	}; 

	
	Ufficio1 test = new Ufficio1 (arrUff);

	
	
	
	
	for(int i = 0; i < arrUff.length; i ++)
	{
			String nome = arrUff[i].getNomeImpiegato();	
			System.out.println(arrUff[i]);
			
	}

	
	
	/*
	Ufficio1 test;
	Impiegato impA, impB, impC;
	String nome ="";
	String cognome = "";
	int stipendio = 0;
	
	Scanner input = new Scanner(System.in);
	
	
	
	
	
	
	int lungArray = input.nextInt(); 
	Impiegato [] arr = new Impiegato[lungArray];
	test = new Ufficio1(arr[], 10);
	
	
	
	
	
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("nome");
			nome = input.nextLine(); 
			input.nextLine(); 
			System.out.println("cognome");
			cognome = input.nextLine(); 
			input.nextLine(); 
			System.out.println("stipendio");
			stipendio = input.nextInt(); 
			
			arr[i] = new Impiegato (nome, cognome, stipendio);
			
			
			
			//arr[i].stampaStato();
			test.stampaUfficio();
			//System.out.println();
		}

	
	*/
	
	}
}