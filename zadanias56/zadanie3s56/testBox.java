package zadanie3s56;

import java.io.IOException;

import javax.swing.JOptionPane;


public class testBox {
    public static void main(String[] args) {
        
        boolean warunek = true;
        
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        Box b = null;
        int licznik = 0;
        double szerokosc;
        double wysokosc;
        
        while(warunek) {
            String sSzerokosc;
//            String sWysokosc;
            licznik++;
            
            sSzerokosc = JOptionPane.showInputDialog("Podaj szerokosc pudelka nr " + licznik);
            if(sSzerokosc == null) {
                JOptionPane.showMessageDialog(null, "Zakonczyles wprowadzanie danych. Wyniki beda widoczne na konsoli");
                break;
            }
            
            try {
                szerokosc = Double.parseDouble(sSzerokosc);
            }
            catch(NumberFormatException exc) {
                JOptionPane.showMessageDialog(null, "Podales wartosc nie bedaca liczba. Program zakonczy dzialanie i " +
                    "wypisze wyniki na konsoli");
                break;
            }
        
        wysokosc = 2 * szerokosc;
            
/*            sWysokosc = JOptionPane.showInputDialog("Podaj wysokosc pudelka nr " + licznik);
            if(sWysokosc == null) {
                JOptionPane.showMessageDialog(null, "Zakonczyles wprowadzanie danych. Wyniki beda widoczne na konsoli");
                break;
            }
            
            try {
                wysokosc = Double.parseDouble(sWysokosc);
            }
            catch(NumberFormatException exc) {
                JOptionPane.showMessageDialog(null, "Podales wartosc nie bedaca liczba. Program zakonczy dzialanie i " +
                    "wypisze wyniki na konsoli");
                break;
            }
*/          
            
           
            try {
                b = new Box(szerokosc, wysokosc);
                System.out.println("Szerokosc pudelka nr " + licznik + " wynosi: " + szerokosc);
                System.out.println("Wysokosc pudelka nr " + licznik + " wynosi: " + wysokosc);
                b1 = b1.joinDiagonal(b);
                b2 = b2.joinHorizontal(b);
                b3 = b3.joinVertical(b);
            }
            catch(IOException exc) {
                JOptionPane.showMessageDialog(null, "Zarowno szerokosc, jak i wysokosc nie moga byc ujemne. Program zakonczy dzialanie i " +
                    "wypisze wyniki na konsoli");
                break;
            }            
        }
        if(b == null) {
            System.out.println("Nie podales wymiarow zadnego pudelka");
            return;
        }
        System.out.println("Rozmiary pudelka powstalego w wyniku polaczenia diagonalnego wynosza: \nszerokosc:" 
                           + b1.getSzerokosc() + "\nwysokosc: " + b1.getWysokosc());
        System.out.println("Rozmiary pudelka powstalego w wyniku polaczenia wertykalnego wynosza: \nszerokosc:" 
                           + b3.getSzerokosc() + "\nwysokosc: " + b3.getWysokosc());
        System.out.println("Rozmiary pudelka powstalego w wyniku polaczenia horyzontalnego wynosza: \nszerokosc:" 
                           + b2.getSzerokosc() + "\nwysokosc: " + b2.getWysokosc());
    }
}
