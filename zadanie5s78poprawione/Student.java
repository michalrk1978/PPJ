package zadanie5s78;


import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.math.*;


public class Student {

    private double[][] wyniki;
    private static Przedmiot[] przedmioty;
    private static int n;
    private String ostrzezenie = "";

    public Student() {
        wyniki = new double[2][n];
    }

    public static void wczytajPrzedmioty(String[] liniaKomend) {
        String sn = liniaKomend[0];
        try {
            n = Integer.parseInt(sn);
        } catch (NumberFormatException exc) {
            System.out.println("Nieprawidlowa linia komend. Podaj prawidlowa ilosc przedmiotow");
            System.exit(1);
        }
        if (n <= 0) {
            System.out.println("Nieprawidlowa linia komend. Podaj prawidlowa ilosc przedmiotow");
            System.exit(1);
        }
        przedmioty = new Przedmiot[n];
        
        for(int i = 0; i < n; i++) {
            przedmioty[i] = new Przedmiot();
            }

        for (int i = 0; i < n; i++) {
            try {               
                przedmioty[i].setNazwa(liniaKomend[2 * i + 1]);
                przedmioty[i].setTyp(liniaKomend[2 * (i + 1)].charAt(0));
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Nieprawidlowa linia komend. Nieprawidlowa ilosc lub rodzaj przedmiotow");
                System.exit(1);
            }
        }


    }
    
    private boolean wczytajZaliczenie(int i) {
        String nazwaPrzedmiotu = przedmioty[i].getNazwa();
        System.out.println("Podaj ocene z zaliczenia z " + nazwaPrzedmiotu);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ostrzezenie = "";
        try {
            wyniki[0][i] = sc.nextDouble();
            wyniki[1][i] = -1;
        } catch (NoSuchElementException exc) {
            ostrzezenie = "Nie podales prawidlowej oceny z " + nazwaPrzedmiotu + "\n";
            sc.nextLine();
            return true;
        }
        if (wyniki[0][i] < 2 || wyniki[0][i] > 5) {
            ostrzezenie = "Nie podales prawidlowej oceny z " + nazwaPrzedmiotu + "\n";
            return true;
        }
        return false;
    }

    private boolean wczytajEgzamin(int i) {
        String nazwaPrzedmiotu = przedmioty[i].getNazwa();
        System.out.println("Podaj ocene z zaliczenia oraz z egzaminu z " + nazwaPrzedmiotu);
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        try {
            wyniki[0][i] = sc.nextDouble();
            wyniki[1][i] = sc.nextDouble();
        } catch (NoSuchElementException exc) {
            ostrzezenie = "Nie podales prawidlowych ocen z " + nazwaPrzedmiotu + "\n";
            sc.nextLine();
            return true;
        }
        if (wyniki[0][i] < 2 || wyniki[0][i] > 5 || wyniki[1][i] < 2 || wyniki[1][i] > 5) {
            ostrzezenie = "Nie podales prawidlowych ocen z " + nazwaPrzedmiotu + "\n";
            return true;
        }
            return false;
    }
    
    public void wczytajWyniki() {
        for (int i = 0; i < n; i++) {
            boolean blad = false;
            do {
                blad = false;
                System.out.print(ostrzezenie);
                if (przedmioty[i].getTyp() == 'x') {
                    blad = wczytajEgzamin(i);
                } else if (przedmioty[i].getTyp() == 'z') {
                    blad = wczytajZaliczenie(i);
                } else {
                    System.out.println("W lini komend podales nieprawidlowy typ przedmiotu");
                    System.exit(1);
                }
            } while(blad);
        }
    }
    
    public String toString() {
        String tabelaPrzedmiotow = String.format("%12s %12s %12s %n", "    ", "zaliczenie", "egzamin");
        for(int i = 0; i < n; i++)
        {
            if(przedmioty[i].getTyp() == 'x')
            {
                tabelaPrzedmiotow += String.format("%12s %12.2f %12.2f %n", przedmioty[i].getNazwa(), wyniki[0][i], wyniki[1][i]);
            }
            else {
                tabelaPrzedmiotow += String.format("%12s %12.2f %12s %n", przedmioty[i].getNazwa(), wyniki[0][i], "x");
            }
        }
        return tabelaPrzedmiotow;
    }
    
    public void show(){
        System.out.println(this);
    }


    public double min() {

        int n = wyniki.length;
        int m = wyniki[0].length;

        double min = 0;

        int k = 0;
        do {
            min = wyniki[0][k];
            k++;
        } while (min == -1);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (wyniki[i][j] == -1) {
                    continue;
                } else {
                    min = Math.min(min, wyniki[i][j]);
                }
            }
        return min;
    }

    public double max() {

        int n = wyniki.length;
        int m = wyniki[0].length;

        double max = wyniki[0][0];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (wyniki[i][j] == -1) {
                    continue;
                } else {
                    max = Math.max(max, wyniki[i][j]);
                }
            }
        return max;
    }

    public double sred() {
        int n = wyniki.length;
        int m = wyniki[0].length;

        double suma = 0;
        int licznik = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (wyniki[i][j] == -1) {
                    continue;
                } else {
                    suma += wyniki[i][j];
                    licznik++;
                }
            }
        return suma / licznik;
    }

    public double minZal() {
        int m = wyniki[0].length;

        double min = 0;

        int k = 0;
        do {
            min = wyniki[0][k];
            k++;
        } while (min == -1);

        for (int i = 0; i < m; i++) {
            if (wyniki[0][i] == -1) {
                continue;
            } else {
                min = Math.min(min, wyniki[0][i]);
            }
        }
        return min;

    }

    public double minEgz() {
        int m = wyniki[1].length;

        double min = 0;

        int k = 0;
        do {
            min = wyniki[1][k];
            k++;
        } while (min == -1);

        for (int i = 0; i < m; i++) {
            if (wyniki[1][i] == -1) {
                continue;
            } else {
                min = Math.min(min, wyniki[1][i]);
            }
        }
        return min;
    }

    public double maxZal() {
        int m = wyniki[0].length;

        double max = wyniki[0][0];

        for (int i = 0; i < m; i++) {
            if (wyniki[0][i] == -1) {
                continue;
            } else {
                max = Math.max(max, wyniki[0][i]);
            }
        }
        return max;

    }

    public double maxEgz() {
        int m = wyniki[1].length;

        double max = wyniki[1][0];

        for (int i = 0; i < m; i++) {
            if (wyniki[1][i] == -1) {
                continue;
            } else {
                max = Math.max(max, wyniki[1][i]);
            }
        }
        return max;
    }

    public double sredZal() {
        int m = wyniki[0].length;

        double suma = 0;
        int licznik = 0;

        for (int i = 0; i < m; i++) {
            if (wyniki[0][i] == -1) {
                continue;
            } else {
                suma += wyniki[0][i];
                licznik++;
            }
        }
        return suma / licznik;
    }

    public double sredEgz() {
        int m = wyniki[1].length;

        double suma = 0;
        int licznik = 0;

        for (int i = 0; i < m; i++) {
            if (wyniki[1][i] == -1) {
                continue;
            } else {
                suma += wyniki[1][i];
                licznik++;
            }
        }
        return suma / licznik;
    }

}


