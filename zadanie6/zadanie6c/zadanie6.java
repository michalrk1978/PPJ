package zadanie6;
import java.util.*;
/**
 * @(#)zadanie6.java
 *
 * zadanie6 application
 *
 * @author
 * @version 1.00 2011/11/18
 */

public class zadanie6 {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	// TODO, add your application code
    	System.out.println("Podaj wartosci kolorów RGB");


    	short R;
		try
		{
			System.out.println("Podaj wartosci R (liczba ca³kowita z przedzia³u 0 .. 255");
    		R = sc.nextShort();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba calkowita. Uruchom program od nowa.");
			return;
		}

		short G;
		try
		{
			System.out.println("Podaj wartosci G (liczba ca³kowita z przedzia³u 0 .. 255");
    		G = sc.nextShort();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba calkowita. Uruchom program od nowa.");
			return;
		}

		short B;
		try
		{
			System.out.println("Podaj wartosci B (liczba ca³kowita z przedzia³u 0 .. 255");
    		B = sc.nextShort();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba calkowita. Uruchom program od nowa.");
			return;
		}

		Kolor k= new Kolor(R, G, B);

		float C = k.getC();

		float M = k.getM();

		float Y = k.getY();

		float K = k.getK();

		System.out.println("Pokrycie Cyan " + C + "%");

		System.out.println("Pokrycie Magenta " + M + "%");

		System.out.println("Pokrycie Yellow " + Y + "%");

		System.out.println("Pokrycie Black " + K + "%");


    }
}
