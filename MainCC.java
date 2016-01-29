/*
Crea un programma per la gestione di un controcorrente gestito dalla classe CC.
Il programma deve essere in grado di effettuare versamenti, 
prelievi, di restituire il saldo e di effettuare la lista degli ultimi 5 movimenti  
*/


import java.util.Scanner;




public class MainCC {

//--------ATTRIBUTI
ContoCorrente [] Conti;

//-------COSTRUTTORE
public MainCC(ContoCorrente [] arrCont){
		Conti = arrCont;
	}

//-------METODI-----	
	public String getNomeConto (int numConto)
	{
			return Conti[numConto].getNome();
	}	
	
	public int getPrelievoMain(int numConto, int valPrel )
	{
			return Conti[numConto].getPrelievi(valPrel);
	}
	
	public int getVersamentoMain(int numConto, int val )
	{
			return Conti[numConto].getVersamenti(val);
	}
	
	
	//----METODO RICERCA
	
	public int ricerca (String cercaNome){
		for (int i = 0; i < Conti.length; i++){
			
		
			if(Conti[i].getNome().equals(cercaNome))
			{return i;}
		}
		return -1;
	}

	
	
	public void stampaConto()
	{
			for(int i = 0; i < Conti.length; i++)
			{
				//System.out.println("Nome: " + Conti[i].getNome() + "Cognome: " + Conti[i].getCognome() + "Saldo: " );
				Conti[i].stampaConto();
			}
	}

public static void main(String[] args){
		
		Scanner input =new Scanner(System.in);

		
		
	MainCC cc = new MainCC (new ContoCorrente []{
			new ContoCorrente ("fabry","priami",1000),
			new ContoCorrente ("simo","renna",1000),
			new ContoCorrente ("massy","russo",1000)
		});
		
		int continua = 0;
		String a = "a";
		String d = "d";
		
		while(continua == 0){		
			
			System.out.println();
			
			cc.stampaConto();
			System.out.println();
			
			System.out.println("aumenta il conto corrente");
			int cliente = cc.ricerca(input.nextLine());
			
		
			
			while (cliente==-1){
				
			
			System.out.println(cliente);
			System.out.println("Persona non trovata!");
			System.out.println("Inserisci il cognome di chi vuoi aumentare lo stipendio:");
			cliente= cc.ricerca(input.nextLine());
			}
			
			
			System.out.println("aumentare o diminiuire? - A per Aumentare - D per Diminuire");
			
			
			if (input.nextLine().equals(a))
			{
				
				System.out.println("aumentare di:");
				int valoreMag = input.nextInt();
				cc.getVersamentoMain(cliente, valoreMag);
			}
			
		
			
			if (input.nextLine().equals(d))
			{
				
				System.out.println("diminuire di:");
				int valoreMin = input.nextInt();
				cc.getPrelievoMain(cliente, valoreMin);
			} 
			
			cc.stampaConto();
			
			System.out.println("continuare? S - N");
			
			
			if (input.nextLine().equals("N"))
			{
			continua = 1;
			}
		}
	}
}	