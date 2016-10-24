package zadanie6;

import java.util.*;

class Zadanie6b {

	/**
	 * Method main
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {



    	Scanner sc = new Scanner(System.in);


    	double x;
		try
		{
			System.out.println("Podaj wartosci sk³adowej x-owej punktu.");
    		x = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba. Uruchom program od nowa.");
			return;
		}

		double y;
		try
		{
			System.out.println("Podaj wartosci sk³adowej y-owej punktu.");
    		y = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba. Uruchom program od nowa.");
			return;
		}

		double z;
		try
		{
			System.out.println("Podaj wartosci sk³adowej z-owej punktu.");
    		z = sc.nextDouble();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba. Uruchom program od nowa.");
			return;
		}


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

		int rozmiar;
		try
		{
			System.out.println("Podaj rozmiar punktu.");
    		rozmiar = sc.nextInt();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest liczba calkowita. Uruchom program od nowa.");
			return;
		}

		Ksztalt ksztalt;
		try
		{
			System.out.println("Podaj ksztalt punktu:(KULA, SZESCIAN, CZWOROSCIAN) ");
			String sKsztalt = sc.next().toUpperCase();
			ksztalt = Enum.valueOf(Ksztalt.class, sKsztalt);
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Podane wyrazenie nie jest prawidlowym ksztaltem. Uruchom program od nowa.");
			return;
		}

				Punkt3D p1 = new Punkt3D(x, y, z, k, rozmiar, ksztalt);
				System.out.println(p1);

				p1.przesun(10, 20, 30);

				System.out.println(p1);

				Punkt3D p2 = new Punkt3D(0, 10, 0, k, rozmiar, ksztalt);

				p2.obroc(3.141592654, 0, 0, 10);

				System.out.println(p2);




	}
}
