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

public class Ufficio1 {


//--------ATTIRUBUTI-------------------
Impiegato [] arrImp = {
//	new Impiegato ("fabry", "priami", 1000),
//	new Impiegato ("massy", "russo", 2000),
//	new Impiegato ("simo", "renna", 3000)
	}; 


//--------COSTRUTTORE-----------------
public Ufficio1  (Impiegato [] arrImpP)
	{
		Impiegato [] arrImp  = arrImpP;
	}


public void setArr(Impiegato [] arrImp) {
    Impiegato [] arrImpP =arrImp;
  }

 	
	
//public Impiegato [] getArr()
//	{return arrImp;}

	
//---------METODI---------------------

public void getNomeImpiegato (String nomeImpiegatoP)
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			Impiegato tempNome = arrImp[i];
			nomeImpiegatoP = tempNome.getNome();
		}
	}	


/*	
public int getStipendioImpiegato (int stipendioImpiegato)
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			Impiegato tempStipendio = arrImp[i];
			stipendioImpiegato = tempStipendio.setStipendio();
		}
		return stipendioImpiegato;
	}

public int setStipendioImpiegato()	
{return inputStipendioImpiegato;}
	
public void getRicerca (String ricercaImpiegato)
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
	}
	
public String setRicerca()	
{return inputRicercaImpiegato;}
	
	
	
*/
/*
public void stampaUfficio()
	{
		for(int i = 0; i < arrImp.length; i++)
		{
			System.out.println(arrImp[i] + "stampaUfficio");
			
		}
		
	}	

*/	
	
	
}


/*
getNomeImpiegato--
getStipendioImpiegato--
stampaUfficio--
ricerca--
aumenta
*/