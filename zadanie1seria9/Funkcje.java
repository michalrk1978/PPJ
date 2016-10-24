package zad1s9;

import java.io.IOException;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//import java.util.Scanner;

public class Funkcje {
    public Funkcje() {
        super();
    }

    public static String wartoscFunkcji(String funkcja) throws IOException {
    String[] args;
    try
    {
      if (funkcja.matches("sin\\(.*"))
      {
        args = funkcja.split("[()]");
        return String.format(Locale.US, "%.3f",sin(toRadians(Double.parseDouble(args[1]))));
      }
      else if (funkcja.matches("cos\\(.*"))
      {
        args = funkcja.split("[()]");
        return  String.format(Locale.US, "%.3f",cos(toRadians(Double.parseDouble(args[1]))));
      }
      else if (funkcja.matches("tg\\(.*"))
      {
        args = funkcja.split("[()]");
        return String.format(Locale.US, "%.3f",tan(toRadians(Double.parseDouble(args[1]))));
      }
      else if (funkcja.matches("ctg\\(.*"))
      {
        args = funkcja.split("[()]");
        return String.format(Locale.US, "%.3f",1 / tan(toRadians(Double.parseDouble(args[1]))));
      }
      else if (funkcja.matches("exp\\(.*"))
      {
        args = funkcja.split("[()]");
        return String.format(Locale.US, "%.3f",exp(Double.parseDouble(args[1])));
      }
      else if (funkcja.matches("ln\\(.*"))
      {
        args = funkcja.split("[()]");
        return String.format(Locale.US, "%.3f",log(Double.parseDouble(args[1])));
      }
      else
      {
        return funkcja;
      }
    }
    catch (NumberFormatException exc)
    {
      throw new IOException("podano nieprawodlowe wyrazenie");
    }
  }

    public static String wartoscWielomianu(String wielomian) throws IOException {
        List<Double> wspolczynniki = new ArrayList<Double>();
        List<Integer> potegi = new ArrayList<Integer>();
        String[] sWspolczynniki = null;
        double argument = 0;
        
        String[] czystyWielomian = wielomian.split(" ");
        String[] liczbaPotega = czystyWielomian[0].split("[+-]");
        String[] znaki = czystyWielomian[0].split("[^+-]+");
        
        try {
            argument = Double.parseDouble(czystyWielomian[1]);
            for (int j = 0; j < liczbaPotega.length; j++) {
                if(!liczbaPotega[j].equals(""))
                {

                    sWspolczynniki = liczbaPotega[j].split("[a-zA-Z]\\^");
                    
                    if(sWspolczynniki.length < 2) throw new IOException("podano nieprawidlowe wyrazenie");
                    
                    wspolczynniki.add(Double.parseDouble(sWspolczynniki[0]));
                    potegi.add(Integer.parseInt(sWspolczynniki[1]));
                }
                
            }
        } catch (Exception exc) {
            throw new IOException("podano nieprawidlowe wyrazenie");
        }
        
        for (int i = 0; i < znaki.length; i++) {
            
            if(!znaki[i].equals("")) 
            {
                if(znaki[i].equals("-"))
                wspolczynniki.set(i,-wspolczynniki.get(i));
            }
        }
        
        double suma = 0;
        for(int i = 0; i < wspolczynniki.size(); i++)
        {
            suma += wspolczynniki.get(i)*pow(argument,potegi.get(i));
        }
        
        return String.valueOf(suma);
    }
}
