package zadanie4s78;

public class Test {
    public static void main(String[] args) {
        
        System.out.println("Test klasy Ksiazka\n");
        
        Ksiazka k1 = new Ksiazka("I.N. Bronsztejn", "Nowoczesne Kompedium Matematyczne" );
        System.out.println(k1);
        System.out.println(k1.getPolka());
        k1.setPolka("polka testowa");
        System.out.println(k1.getPolka());
        
        Ksiazka k2 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz");
        System.out.println(k2);
        System.out.println(k2.getPolka());
        
        Ksiazka k3 = new Ksiazka("Terry Ptatchett", "Kolor Magii");
        
        Ksiazka k4 = new Ksiazka("Fiodor Dostojewski", "Zbrodnia i Kara");
        
        Ksiazka k5 = new Ksiazka("Andrzej Sapkowski", "Wiedzmin");
        
        System.out.println("\n\nTest tworzenia polek, wstawiania do nich ksiazek i uzyskiwania o nich informacji \n");
        
        Polka p1 = new Polka("prawa gorna", 5);
        
        Polka p2 = new Polka("srodkowa", 10);
        
        Polka p3 = new Polka("lewa dolna", 3);
        try {
            p1.wstaw(k1);
            p1.wstaw(k2);
            
            p2.wstaw(k3);
            p2.wstaw(k4);
            
            p3.wstaw(k5);
        }
        catch(BrakMiejscaException exc) {
            System.out.println(exc);
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        try{
            Ksiazka k6 = p1.getKsiazka("Pan Tadeusz", "Adam Mickiewicz");
            System.out.println("ksiazka Pan Tadeusz jest na polce " + k6.getPolka());
        } catch(Exception exc) {
            System.out.println();
        }
                    
        
        System.out.println("\nTest przestawiania ksiazki z jednej polki do drugiej i wyjmowania z polki\n");
        try
        {
            p1.wstaw(p2, "Kolor Magii", "Terry Ptatchett");
            p1.wstaw(p3, "Wiedzmin", "Andrzej Sapkowski");
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        
        try{
            Ksiazka k7 = p1.getKsiazka("Kolor Magii", "Terry Ptatchett");
            System.out.println("ksiazka Kolory Magii jest na polce " + k7.getPolka() + "\n");
        } catch(Exception exc) {
            System.out.println();
        }
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        Ksiazka k8 = null;
        try{
            k8 = p1.przesunDoLuzem("Pan Tadeusz", "Adam Mickiewicz");    
        }
        catch(Exception exc) {
            System.out.println();
        }
        
        System.out.println("Z polki prawa gorna wyjeto ksiazke Adama Mickiewicza Pan Tadeusz\n");
        System.out.println("Ksiazka Adama Mickiewicza Pan Tadeusz jest " + k8.getPolka() +"\n");
        System.out.println(p1);
        
        System.out.println("\nTest wyjatkow\n");
        try {
            p1.znajdzKsiazke("aaa", "bbb");
        }
        catch(Exception exc){
            System.out.println(exc);
        }
        
        try{
            p3.wstaw(k1);
            p3.wstaw(k2);
            p3.wstaw(k3);
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
                
        try{
            p3.wstaw(p1, "Nowoczesne Kompedium Matematyczne", "I.N. Bronsztejn");
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        
                
        try
        {
            p3.usun("Nowoczesne Kompedium Matematyczne", "I.N. Bronsztejn");
        }
        catch(Exception exc) {
            System.out.println(exc);
        }

        try{
            p3.wstaw(p1, "I.N. Bronsztejn", "Nowoczesne Kompedium Matematyczne");  //autor zamieniony kolejnoscia z tytulem
        }
        catch(Exception exc) {
           System.out.println(exc);     
        }
        
        try{
            p3.usun("Nowoczesne Kompedium Matematyczne", "I.N. Bronsztejn");
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
    }
    
   
        
    
}
