package zadanie5s78;


import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.math.*;

public class Student {
    private double [][] wyniki;
    
    public Student() {
        wyniki = new double[2][4];
    }
    
    
    public void wczytajWyniki() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String ostrzezenie = "";
        boolean blad = false;
        do {
            blad = false;
            System.out.println(ostrzezenie);
            
            System.out.println("Podaj ocene z zaliczenia z angielskiego: ");
            try {
                wyniki[0][0] = sc.nextDouble();
                wyniki[1][0] = -1;
            } catch(NoSuchElementException exc) {
                blad = true;
                ostrzezenie = "Nie podales prawidlowej oceny z angielskiego. ";
                sc.nextLine();
                continue;
            }
            if(wyniki[0][0] < 2 || wyniki[0][0] > 5) {
                blad = true;
                ostrzezenie = "Nie podales prawidlowej oceny z angielskiego. ";
                continue;
            }
            
            System.out.println("Podaj ocene z zaliczenia oraz z egzaminu z MAD: ");
            try {
                wyniki[0][1] = sc.nextDouble();
                wyniki[1][1] = sc.nextDouble();
            } catch(NoSuchElementException exc) {
                blad = true;
                ostrzezenie = "Nie podales prawidlowych ocen z MAD. ";
                sc.nextLine();
                continue;
            }
            if(wyniki[0][1] < 2 || wyniki[0][1] > 5 || wyniki[1][1] < 2 || wyniki[1][1] > 5) {
                blad = true;
                ostrzezenie = "Nie podales prawidlowych ocen z MAD. ";
                continue;
            }
            
            System.out.println("Podaj ocene z zaliczenia z programowania1: ");
            try{
                wyniki[0][2] = sc.nextDouble();
                wyniki[1][2] = -1;
            }catch(NoSuchElementException exc){
                blad = true;
                ostrzezenie = "Nie podales prawidlowej oceny z programowania1: ";
                sc.nextLine();
                continue;
            }
            if(wyniki[0][2] < 2 || wyniki[0][2] > 5) {
                blad = true;
                ostrzezenie = "Nie podales prawidlowej oceny z programowania1: ";
                continue;
            }
                
            System.out.println("Podaj ocene z zaliczenia oraz z egzaminu z algebry");
            try {
                wyniki[0][3] = sc.nextDouble();
                wyniki[1][3] = sc.nextDouble();
            } catch (NoSuchElementException exc) {
                blad = true;
                ostrzezenie = "Nie podales prawidlowych oceny z algebry: ";
                sc.nextLine();
                continue;
            }           
            if(wyniki[0][3] < 2 || wyniki[0][3] > 5 || wyniki[1][3] < 2 || wyniki[1][3] > 5) {
               blad = true;
                ostrzezenie = "Nie podales prawidlowych oceny z algebry: ";
                continue;            
            }
        } while (blad);
     }
    
    public double min() {
        
        int n = wyniki.length;
        int m = wyniki[0].length;
        
        double min = 0;
        
        int k = 0;
        do{            
            min = wyniki[0][k];
            k++;
        }
        while(min == -1);
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) {
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
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) {
                if(wyniki[i][j] == -1) {
                    continue;
                }
                else{
                    max = Math.max(max, wyniki[i][j]);
                }               
            }
        return max;
    }
    
    public double sred()
    {
        int n = wyniki.length;
        int m = wyniki[0].length;
        
        double suma=0;
        int licznik = 0;
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) {
                if(wyniki[i][j] == -1) {
                    continue;
                }
                else{
                    suma += wyniki[i][j];
                    licznik++;
                }               
            }
        return suma/licznik;
    }
    
    public double minZal(){
        int m = wyniki[0].length;
        
        double min = 0;
        
        int k = 0;
        do{            
            min = wyniki[0][k];
            k++;
        }        
        while(min == -1);
                
            for(int i = 0; i < m; i++) {
                if (wyniki[0][i] == -1) {
                    continue;
                } else {
                    min = Math.min(min, wyniki[0][i]);
                }
            }
        return min;
        
    }
    
    public double minEgz(){
        int m = wyniki[1].length;
        
        double min = 0;
        
        int k = 0;
        do{            
            min = wyniki[1][k];
            k++;
        }
        while(min == -1);
                
            for(int i = 0; i < m; i++) {
                if (wyniki[1][i] == -1) {
                    continue;
                } else {
                    min = Math.min(min, wyniki[1][i]);
                }
            }
        return min;        
    }
    
    public double maxZal(){
        int m = wyniki[0].length;
        
        double max = wyniki[0][0];
                
            for(int i = 0; i < m; i++) {
                if (wyniki[0][i] == -1) {
                    continue;
                } else {
                    max = Math.max(max, wyniki[0][i]);
                }
            }
        return max;
        
    }
    
    public double maxEgz(){
        int m = wyniki[1].length;
        
        double max = wyniki[1][0];
                
            for(int i = 0; i < m; i++) {
                if (wyniki[1][i] == -1) {
                    continue;
                } else {
                    max = Math.max(max, wyniki[1][i]);
                }
            }
        return max;        
    }
    
    public double sredZal()
    {
        int m = wyniki[0].length;
        
        double suma=0;
        int licznik = 0;
        
            for(int i = 0; i < m; i++) {
                if(wyniki[0][i] == -1) {
                    continue;
                }
                else{
                    suma += wyniki[0][i];
                    licznik++;
                }               
            }
        return suma/licznik;
    }
    
    public double sredEgz()
    {
        int m = wyniki[1].length;
        
        double suma=0;
        int licznik = 0;
        
            for(int i = 0; i < m; i++) {
                if(wyniki[1][i] == -1) {
                    continue;
                }
                else{
                    suma += wyniki[1][i];
                    licznik++;
                }               
            }
        return suma/licznik;
    }
    
}


