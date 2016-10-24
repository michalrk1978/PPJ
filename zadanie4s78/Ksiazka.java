package zadanie4s78;

public class Ksiazka {
    private String autor;
    private String tytul;
    private String polka;
    
    public Ksiazka(String sAutor, String sTytul) {
        autor = sAutor;
        tytul = sTytul;
        polka = "luzem";
    }
    
    public void setPolka(String sPolka) {
        polka = sPolka;
    }
    
    public String getPolka() {
        return polka;
    }
    
    public String getTytul() {
        return tytul;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String toString(){
        return autor + "  " + tytul;
    }
}
