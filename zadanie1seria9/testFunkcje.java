package zad1s9;

import java.io.IOException;

import javax.swing.JOptionPane;

public class testFunkcje {
    public testFunkcje() {


    }

    public static void main(String[] args) {
        
        String wyrazenie = "";
        String ostrzezenie = "";
        String wynik = null;
        
        while((wyrazenie = JOptionPane.showInputDialog(ostrzezenie + " Podaj wyrazenie w postaci: sin(x), ... lub ax^n+...+zx^0 argument" )) != null) 
        {
          
         try {
            wynik = Funkcje.wartoscFunkcji(wyrazenie);
           if(wynik.equals(wyrazenie))
           {
              wynik = Funkcje.wartoscWielomianu(wyrazenie); 
            }
           
          
        } catch (IOException exc) {
            ostrzezenie = (exc.getMessage());
            continue;
        }
      JOptionPane.showMessageDialog(null, wyrazenie + " = " + wynik);
      }
    }
}
