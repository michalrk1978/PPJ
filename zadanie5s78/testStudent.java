package zadanie5s78;

public class testStudent {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.wczytajWyniki();
        
        System.out.println("Najnizsza ocena wynosi: " + s1.min());
        System.out.println("Srednia ocena wynosi: " + s1.sred());
        System.out.println("Najwyzsza ocena wynosi: " + s1.max());
        
        System.out.println("Najnizsza ocena z zaliczen wynosi: " + s1.minZal());
        System.out.println("Srednia ocena z zaliczenia wynosi: " + s1.sredZal());
        System.out.println("Najwyzsza ocena z zaliczenia wynosi: " + s1.maxZal());
        
        System.out.println("Najnizsza ocena z egzaminu wynosi: " + s1.minEgz());
        System.out.println("Srednia ocena z egzaminu wynosi: " + s1.sredEgz());
        System.out.println("Najwyzsza ocena z egzaminie wynosi: " + s1.maxEgz());
                
    }
}
