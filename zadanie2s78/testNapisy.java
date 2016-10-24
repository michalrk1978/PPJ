package zadanie2s78;

import java.util.Scanner;

public class testNapisy {
    public static void main(String[] args) {
        Napisy n1 = new Napisy();
        Scanner sc = new Scanner(System.in);
        String tmp = "";
        
        System.out.println("Podaj napis. Zeby zakonczyc napisz koniec");
        tmp = sc.next();
        while(!tmp.equals("koniec"))
        {
            n1.dodaj(tmp);
            System.out.println("Podaj napis. Zeby zakonczyc napisz koniec");
            tmp = sc.next();
        } 
        
        
        System.out.println(n1);
    }
}
