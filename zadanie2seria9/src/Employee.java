package seria9z2;

import java.util.Locale;


public class Employee {
    private String imie;
    private String nazwisko;
    private int wiek;
    private double pensja;

    public Employee(String sImie, String sNazwisko, int sWiek, double sPensja) 
    {
            imie = sImie;
            nazwisko = sNazwisko;
            wiek = sWiek;
            pensja = sPensja;
        }
    
    /**
     * @return String
     */
    @Override
    public String toString() {
        return String.format(Locale.US, "%s   %s, lat %d   zarabia %.5f", imie, nazwisko, wiek, pensja);
    }

    public void zmienPensje(double procent) {
            pensja *= (1 + procent / 100);
        }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public double getPensja() {
        return pensja;
    }

    public void setImie(String sImie) {
        imie = sImie;
    }

    public void setNazwisko(String sNazwisko) {
        nazwisko = sNazwisko;
    }

    public void setWiek(int sWiek)  {
        
            wiek = sWiek;
        }

    public void setPensja(double sPensja) {
            pensja = sPensja;
        }
    
}
