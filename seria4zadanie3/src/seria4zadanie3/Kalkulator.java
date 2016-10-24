package seria4zadanie3;

import javax.swing.*;
import java.util.*;

public class Kalkulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		 String wyrazenie = ""; 
	        
	        String ostrzezenie = "";
	        
	        double liczba1, liczba2, wynik = 0;
	        
	        while((wyrazenie = JOptionPane.showInputDialog(ostrzezenie + "Podaj wyrazenie w postaci: liczba1 operator liczba2." )) != null)
	        {
	        	
	        	ostrzezenie = "";
	        		
	        	StringTokenizer stWyrazenie = new StringTokenizer(wyrazenie);
	        	StringTokenizer stWyrazenieDelim = new StringTokenizer(wyrazenie, "+-*/", true);
	        	
	        	String liczba1S;
	        	String operatorS;
	        	String liczba2S;
	        	
	        	if ( stWyrazenie.countTokens() == 3 )
	        	{
	        		
	        		liczba1S = stWyrazenie.nextToken();
		        	operatorS = stWyrazenie.nextToken();
		        	liczba2S = stWyrazenie.nextToken();
	        		        		 
	        	}
	        	else
	        	if( stWyrazenieDelim.countTokens() == 3 )
	        	{
	        		liczba1S = stWyrazenieDelim.nextToken();
	        		operatorS = stWyrazenieDelim.nextToken();
	        		liczba2S = stWyrazenieDelim.nextToken();
	        	}
	        	else
	        	{
	        		ostrzezenie = "Twoje wyrazenie NIE mialo postaci: liczba1 operator liczba2 ";
	        		continue;
	        	}
	        	
	        	
	        	
	        	try
	        	{
	        
	        		liczba1 = Double.parseDouble(liczba1S);
	        		liczba2 = Double.parseDouble(liczba2S);
	        	}
	        	catch(NumberFormatException exc)
	        	{
	        		ostrzezenie = " Twoje wyrazenie NIE mialo postaci: liczba1 operator liczba2 ";
	        		continue;
	        	}
	        		   	
	        	if(operatorS.length() != 1)
	        	{
	        		ostrzezenie = " Twoje wyrazenie NIE mialo postaci: liczba1 operator liczba2 ";
	        		continue;
	        	}
	        	
	        	char operator = operatorS.charAt(0);
	        	
	        	switch (operator) 
	        		{
	        		
					case '+': wynik = liczba1 + liczba2; 
							  break;
							  
					case '-': wynik = liczba1 - liczba2; 
							  break;
							  
					case '*': wynik = liczba1 * liczba2;
						      break;
						      
				    case '/':
				    	if( liczba2 != 0)
				    	{
				    	 	  wynik = liczba1 / liczba2;
				    		  break;
				    	}
				    	else
				    	{
				    		ostrzezenie = "Nie mozna dzielic przez zero. ";
				    		continue;
				    	}
				    
				    default:
				    {
				    	ostrzezenie = "Nie podales wlasciwego operatora. ";
				    	continue;
				    }
				    	
					}
				JOptionPane.showMessageDialog(null, wyrazenie + " = " + wynik);	
	 
	        }
	        	
	    }

	}


