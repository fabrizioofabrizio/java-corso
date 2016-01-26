/*
Classe Ufficio che abbia:  come unico attributo 
un array di impiegati, un costruttore che prenda in input un array di tipo 
Impiegato, un metodo getNomeImpiegato che restituisca il nome 
dell'impiegato in posizione i passata come parametro, un metodo 
getStipendioImpiegato analogo al precedente, un metodo 
stampaUfficio che stampi a video tutti gli impiegati con i relativi 
stipendi, un metodo ricerca che  dato il nome di un impiegato ne 
restituisca la posizione nell'array, un metodo aumenta che dati 
posizione dell'impiegato nell'array e importo aumenti lo 
stipendio correttamente
*/





import java.util.Scanner;

public class Ufficio {


//--------ATTIRUBUTI-------------------
Impiegato [] arrImp = new Impiegato[5]; 


//--------COSTRUTTORE-----------------
public Ufficio (Impiegato arrImp[], String nomeImpiegato, int stipendioImpiegato, String ricercaImpiegato)
	{
		this.arrImp  = arrImp;
	}

	
//---------METODI---------------------

public void setNomeImpiegato (String nomeImpiegato)
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			Impiegato tempNome = arrImp[i];
			nomeImpiegato = tempNome.getNome();
		}
	}	


	
public int getStipendioImpiegato (int stipendioImpiegato)
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			Impiegato tempStipendio = arrImp[i];
			stipendioImpiegato = tempStipendio.setStipendio();
		}
		return stipendioImpiegato;
	}

	
	
public String getRicerca (String ricercaImpiegato)
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			Impiegato tempNomeRicerca = arrImp[i];
			String ricercaImp = tempNomeRicerca.getNome();
				if(ricercaImp.equals(ricercaImpiegato))
				{
					int pos = i;
					System.out.println("posizione del nome: " + pos);
				}
			
		}
		return ricercaImpiegato;
	}
	

	
	
	
public void stampaUfficio()
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			System.out.println(arrImp[i]);
		}
		
	}	

	
	
	
}


/*
getNomeImpiegato--
getStipendioImpiegato--
stampaUfficio--
ricerca--
aumenta
*/