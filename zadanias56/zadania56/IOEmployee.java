package zadanie1s56;


import javax.swing.*;


public class IOEmployee
{
    public static Employee defEmp(String msg)
    {
            String ostrzezenie = "";
            String sImie = null;

            boolean blad = false;

            do
            {
            	blad = false;
            	sImie = JOptionPane.showInputDialog(msg + ostrzezenie + " Podaj imie");
            	ostrzezenie = " Nie podales imienia.";


            	if(sImie == null)
            	{
            		continue;
            	}

                if(sImie.equals(""))
                {
                	ostrzezenie = " Nie podales imienia.";
                	blad = true;
                }


            }
            while(sImie == null || blad);


            ostrzezenie = "";
            String sNazwisko = null;

            blad = false;

            do
            {
            	blad = false;
            	sNazwisko = JOptionPane.showInputDialog(msg + ostrzezenie + " Podaj nazwisko");
            	ostrzezenie = " Nie podales nazwiska.";

				if(sNazwisko == null)
				{
					continue;
				}

                if(sNazwisko.equals(""))
                {
                	ostrzezenie = " Nie podales nazwiska.";
                	blad = true;
                }



            }
            while(sNazwisko == null || blad);


            blad = false;

            ostrzezenie ="";
            String sWiek;
            int wiek = 0;



            do
            {
            	blad = false;

            	sWiek = JOptionPane.showInputDialog(msg + ostrzezenie + " Podaj wiek.");
                ostrzezenie = " Nie podales wieku.";
                if(sWiek == null)
                {
                	continue;
                }

                try
                {
                    wiek = Integer.parseInt(sWiek);
                }
                catch(NumberFormatException exc)
                {
                    ostrzezenie = " Nie podales liczby calkowitej";
                    blad = true;
                }

                if (wiek <= 0)
                {
                    ostrzezenie = " Wiek musi byc wiekszy od zera";
                    blad = true;
                }

            }
            while( sWiek == null || blad);


			blad = false;

            ostrzezenie = "";
            String sPensja = null;
            double pensja =0;


            do
            {
            	blad = false;

                sPensja = JOptionPane.showInputDialog(msg + ostrzezenie + " Podaj zarobki");
                ostrzezenie = " Nie podales pensji.";
                if(sPensja == null)
                {
                	continue;
                }

                try
                {
                	pensja = Double.parseDouble(sPensja);
                }
                catch(NumberFormatException esc)
                {
                	ostrzezenie = " Nie podales liczby";
                	blad = true;
                }

                if(pensja < 0)
                {
                	ostrzezenie = " Pensja nie moze byc ujemna";
                	blad = true;
                }

            }
            while(sPensja == null || blad);


            return new Employee(sImie, sNazwisko, wiek, pensja);


	}

	public static void showInfo(Employee emp)
	{
		JOptionPane.showMessageDialog(null, emp.toString());
	}

	public static void changeSalary (Employee emp)
	{
		 String ostrzezenie = "";
         String sZmiana = null;
         double zmiana = 0;

         boolean blad = false;

		 do
         {
         		blad = false;

                sZmiana = JOptionPane.showInputDialog(ostrzezenie + "Podaj procent o jaki chcesz zmienic zarobki ");
				ostrzezenie = "Nie podales zmiany ";
				if(sZmiana == null)
				{
					continue;
				}

                try
                {
                	zmiana = Double.parseDouble(sZmiana);
                }
                catch(NumberFormatException esc)
                {
                	ostrzezenie = "Nie podales liczby";
                	blad = true;
                }

                if(zmiana == 0)
                {
                	ostrzezenie = "Pensja nie zosta³a zmieniona ";
                	blad = true;
                }

                if(zmiana < 0)
                {
                	ostrzezenie = "Zwiazki zawodowe nie pozwalaja zmniejszyc pensji ";
                	blad = true;
                }
           }
           while(sZmiana == null || blad);


		   emp.zmienPensje(zmiana);
	}
}