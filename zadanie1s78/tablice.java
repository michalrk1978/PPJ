package zadanie1;

import java.util.Scanner;



public class tablice {



    private static int[] ltab ={2, 5, 3, 1, 7};

    private static String[] txt;

    public static void ustawLtab()
    {

        String ostrzezenie = "";
        int ilosc =0;
        String wyrazenie;
        Scanner sc = new Scanner(System.in);


        do
        {
            System.out.println(ostrzezenie + "Podaj ilosc elementow jaka ma sie znalesc w tablicy");
            try
            {
                ilosc = sc.nextInt();
            }
            catch(NumberFormatException exc)
            {
                ostrzezenie = "Podana ilosc elementow nie jest liczba typu int";
                continue;
            }
            if(ilosc < 0)
            {
                ostrzezenie = "Ilosc elementow nie moze byc ujemna";
                continue;
            }
            else
            {
                ltab = new int[ilosc];
            }

        }
        while(ilosc > Integer.MAX_VALUE);

        for(int i =0; i < ltab.length; i++)
        {
            ltab[i] = 0;
        }

        int liczba;
        int licznik = 0;

        System.out.println("Podaj poszczegulne liczby z tablicy. Zeby zakonczyc napisz koniec");
        for(int i =0; i < ltab.length; i++)
        {
        	System.out.println("podaj kolejna liczbe");

        	wyrazenie = sc.next();
        	if(wyrazenie.equals("koniec"))
            {
            	System.out.println("Zakonczyles program bez podawania wszystkich elementow tablicy. Elementy ktorych nie podales beda mialy wartosc 0");
            	break;
            }

            try
            {
                liczba = Integer.parseInt(wyrazenie);
                ltab[licznik] = liczba;
                licznik++;
            }
            catch(NumberFormatException exc)
            {
                   ostrzezenie = "nie podales liczby typu Int - podaj ponownie ta liczbe";
                   continue;
            }
        }
    }
    /**
     * @return
     */
    public static int suma() {
        int suma = 0;
        for(int i =0; i < ltab.length; i+=2) {
            suma += ltab[i];
        }
       return suma;
    }

    public static void literki()
    {

        txt = new String[ltab.length];
        for(int i = 0; i < ltab.length; i++)
        {
            char a = (char)('a' + i);
            String s = "";
            for(int j = 0; j < ltab[i]; j++)
            {
               s += a;
            }
        txt[i] = s;
        }

    }

    public static void przestaw() {

        String tmp;
        for(int i = 0; i < txt.length/2; i++)
        {
            tmp = txt[2*i];
            txt[2*i] = txt[2*i+1];
            txt[2*i+1] = tmp;
        }
    }

    public static void show()
    {
        for(int i =0; i < ltab.length; i++)
         {
            System.out.println(txt[i]);
         }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String elementy = "";

        for(int el : ltab) elementy += (el + ", " );

        System.out.println("tablica ltab zawiera elementy: " + elementy);
        System.out.println("suma elementow o indeksach parzystych wynosi: " + tablice.suma());
        tablice.literki();
        tablice.show();
        tablice.przestaw();
        System.out.println("tablica znakow po zamianie elementw o indeksach parzystych z nieparzystymi:");
        tablice.show();
        tablice.ustawLtab();
        tablice.literki();
        System.out.println("suma elementow o indeksach parzystych wynosi:" + tablice.suma());
        tablice.show();
        tablice.przestaw();
        System.out.println("tablica znakow po zamianie elementw o indeksach parzystych z nieparzystymi:");
        tablice.show();


}
}