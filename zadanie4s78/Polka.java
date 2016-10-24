package zadanie4s78;


public class Polka {

    private String nazwa;
    private Ksiazka[] ksiazki;

    public Polka(String sNazwa, int sRozmiar) {
        ksiazki = new Ksiazka[sRozmiar];
        nazwa = sNazwa;
    }

    /* metoda do wstawiania ksiazek ktore nie sa jeszcze na zadnej polce */

    public void wstaw(Ksiazka ksiazka) throws BrakMiejscaException {
        boolean blad = true;
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i] == null) {
                ksiazki[i] = ksiazka;
                ksiazka.setPolka(nazwa);
                blad = false;
                break;
            }
        }
        if (blad == true) {
            throw new BrakMiejscaException("Nie ma miejsca na polce: " + nazwa);
        }
    }

    public Ksiazka przesunDoLuzem(String tytul, String autor) throws NieZnalezionoKsiazkiException {
        
        Ksiazka tmp;
        
        for(int i = 0; i < ksiazki.length; i++){
            if(ksiazki[i] != null && ksiazki[i].getTytul() == tytul && ksiazki[i].getAutor() == autor) {
                tmp = ksiazki[i];
                tmp.setPolka("luzem");
                ksiazki[i] = null;
                return tmp;
            }
        }
        throw new NieZnalezionoKsiazkiException("Nie znaleziono ksiazki na polce " + nazwa);
    }

    public void usun(String tytul, String autor) throws NieZnalezionoKsiazkiException {
        boolean blad = true;
        for (int i = 0; i < ksiazki.length; i++) {
            if (ksiazki[i] != null && ksiazki[i].getTytul() == tytul && ksiazki[i].getAutor() == autor) {
                ksiazki[i] = null;
                blad = false;
                break;
            }
        }
        if (blad == true) {
            throw new NieZnalezionoKsiazkiException("Nie znaleziono ksiazki na polce: " + nazwa);
        }
    }

    /* funkcja zwraca referencje do objektu ktory caly czas jest na polce */
    public Ksiazka getKsiazka(String tytul, String autor) throws NieZnalezionoKsiazkiException {

        for(int i = 0; i < ksiazki.length; i++){
            if(ksiazki[i] != null && ksiazki[i].getTytul() == tytul && ksiazki[i].getAutor() == autor) {
                return ksiazki[i];
            }
        }
        throw new NieZnalezionoKsiazkiException("Nie znaleziono ksiazki na polce " + nazwa);
    } 
    
    public Ksiazka znajdzKsiazke(String tytul, String autor)throws NieZnalezionoKsiazkiException {
        
        for(int i = 0; i < ksiazki.length; i++){
            if(ksiazki[i] != null && ksiazki[i].getTytul() == tytul && ksiazki[i].getAutor() == autor) {
                return ksiazki[i];
            }
        }
        throw new NieZnalezionoKsiazkiException("Nie znaleziono ksiazki na polce: " + nazwa);
    }
    
    public void wstaw(Polka polka, String tytul, String autor) throws BrakMiejscaException, NieZnalezionoKsiazkiException {
        boolean blad = true;
        for(int i = 0; i < ksiazki.length; i++) {
            if(ksiazki[i] == null) {
                ksiazki[i] = polka.znajdzKsiazke(tytul, autor);
                ksiazki[i].setPolka(nazwa); 
                polka.usun(tytul, autor);
                blad = false;
                break;
            }
        }
        if(blad == true){
            throw new BrakMiejscaException ("Nie ma miejsca na polce: " + nazwa);
        }
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer(nazwa + "\n---------\n");
        for(int i =0; i< ksiazki.length; i++) {
            if(ksiazki[i] != null) {
                sb.append(ksiazki[i].toString());
                sb.append("\n");
                }
            
            }
        return sb.toString();
    }

}
