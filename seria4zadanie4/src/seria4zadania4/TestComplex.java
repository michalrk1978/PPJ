package seria4zadania4;

import java.util.*;

public class TestComplex {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	   	Scanner sc = new Scanner(System.in);
	   			
		double liczba1C1=0;
		try
		{
			System.out.println("Podaj czêœæ rzeczywist¹ pierwszej liczby zespolonej");
    		liczba1C1 = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyra¿enie nie jest liczb¹. Uruchom program od nowa.");
			return;
		}
		
		double liczba2C1=0;
		try
		{		
			System.out.println("Podaj czêœæ urojon¹ pierwszej liczby zespolonej");    		
			liczba2C1 = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyra¿enie nie jest liczb¹. Uruchom program od nowa.");
		}
		
		Complex cp1 = new Complex(liczba1C1, liczba2C1);
		
		double liczba1C2=0;
		try
		{
			System.out.println("Podaj czêœæ rzeczywist¹ drugiej liczby zespolonej");
    		liczba1C2 = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyra¿enie nie jest liczb¹. Uruchom program od nowa.");
			return;
		}
		
		double liczba2C2=0;
		try
		{		
			System.out.println("Podaj czêœæ urojon¹ drugiej liczby zespolonej");    		
			liczba2C2 = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyra¿enie nie jest liczb¹. Uruchom program od nowa.");
		}
		
		Complex cp2 = new Complex(liczba1C2, liczba2C2);
		
		Complex cp3 = new Complex(cp1);
		
		Complex cp4 = new Complex(cp1);
		
		Complex cp5 = new Complex(cp1);
		
		Complex cp6 = new Complex(cp1);
		
		System.out.println("Wynik dodawania pierwszej i drugiej liczby zespolonej");
		
		cp1.add(cp2);
		cp1.show();
		
		System.out.println("Wynik odejmowania drugiej liczby zespolonej od pierwszej");
		
		cp3.sub(cp2);
		cp3.show();
		
		System.out.println("Wynik mnozenia liczby pierwszej przez drug¹");
		
		cp4.mul(cp2);
		cp4.show();
		
		System.out.println("Wynik dzielenia liczby pierwszej przez drug¹");
		
		cp5.div(cp2);
		cp5.show();
		
		if(cp2.equals(cp6)) 
		{
			System.out.println("Pierwsza i druga liczba s¹ takie same");
		}
		else
		{
			System.out.println("Liczba pierwsza ró¿ni siê od drugiej");
		}
		

	}

}
