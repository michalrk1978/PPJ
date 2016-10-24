package zadanie3s78;

import java.io.IOException;

public class testMatrix {
    public static void main(String[] args) {

        double[][] A = { { 2, 3 }, { 1, 7 }, { 3.1, 2 } };

        double[][] B = { { 1, 8, 2 }, { 2, 2, 2 } };

        double[][] C = { { 2, 2, 2 }, { 2, 2, 2 } };

        double[][] x = { { 1, 2, 3 } };

        double[][] y = { { 1 }, { 2 }, { 3 } };
        double q = 3;

        Matrix MA = new Matrix(A);
        Matrix MB = new Matrix(B);
        Matrix MC = new Matrix(C);
        Matrix Mx = new Matrix(x);
        Matrix My = new Matrix(y);
        
        
        System.out.println("Wynik A+B: ");
        try {
            System.out.println(MA.add(MB));
        } catch (IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik B+C: ");
        try {
            System.out.println(MB.add(MC));
        } catch (IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik AB: ");        
        try {
            System.out.println(MA.mul(MB));
        } catch (IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik BC: ");
        try{
          System.out.println(MB.mul(MC));  
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik Ax: ");
        try{
          System.out.println(MA.mul(Mx));
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik Bx: ");
        try{
            System.out.println(MB.mul(Mx));
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik Ay: ");
        try{
            System.out.println(MA.mul(My));
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik By: ");
        try{
            System.out.println(MB.mul(My));
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik xy: ");
        try{
            System.out.println(Mx.mul(My));
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik yx: ");
        try{
            System.out.println(My.mul(Mx));
        }
        catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Wynik qA: ");
        System.out.println(MA.mul(q));
        
        System.out.println("Wynik qx: ");
        System.out.println(Mx.mul(q));
        
        System.out.println("Wynik B-C");
        try{
            System.out.println(MB.sub(MC));   
        }catch(IOException exc) {
            System.out.println(exc);
        }
        
        System.out.println("Suma kolumnowa A");
        double[] sumaKolumnowa = MA.sumaKolumnowa();
        for(int i = 0; i < sumaKolumnowa.length; i++) {
            System.out.print(sumaKolumnowa[i] + "  ");
        }
        System.out.println();
        System.out.println();
          
        System.out.println("Suma wierszowa A");
        double[] sumaWierszowa = MA.sumaWierszowa();
        for(int i = 0; i < sumaWierszowa.length; i++) {
            System.out.println(sumaWierszowa[i]);
        }
        System.out.println();
        
        System.out.println("Calkowita suma A");
        double calkowitaSuma = MA.calkowitaSuma();
        System.out.println(calkowitaSuma);
        System.out.println();
        
        System.out.println("Suma kolumnowa B");
        sumaKolumnowa = MB.sumaKolumnowa();
        for(int i = 0; i < sumaKolumnowa.length; i++) {
            System.out.print(sumaKolumnowa[i] + "  ");
        }
        System.out.println();
        System.out.println();
          
        System.out.println("Suma wierszowa B");
        sumaWierszowa = MB.sumaWierszowa();
        for(int i = 0; i < sumaWierszowa.length; i++) {
            System.out.println(sumaWierszowa[i]);
        }
        System.out.println();
        
        System.out.println("Calkowita suma B");
        calkowitaSuma = MB.calkowitaSuma();
        System.out.println(calkowitaSuma);
        System.out.println();
        
        System.out.println("Suma kolumnowa x");
        sumaKolumnowa = Mx.sumaKolumnowa();
        for(int i = 0; i < sumaKolumnowa.length; i++) {
            System.out.print(sumaKolumnowa[i] + "  ");
        }
        System.out.println();
        System.out.println();
          
        System.out.println("Suma wierszowa x");
        sumaWierszowa = Mx.sumaWierszowa();
        for(int i = 0; i < sumaWierszowa.length; i++) {
            System.out.println(sumaWierszowa[i]);
        }
        System.out.println();
        
        System.out.println("Calkowita suma x");
        calkowitaSuma = Mx.calkowitaSuma();
        System.out.println(calkowitaSuma);
        System.out.println();
        
        System.out.println("Suma kolumnowa y");
        sumaKolumnowa = My.sumaKolumnowa();
        for(int i = 0; i < sumaKolumnowa.length; i++) {
            System.out.print(sumaKolumnowa[i] + "  ");
        }
        System.out.println();
        System.out.println();
          
        System.out.println("Suma wierszowa y");
        sumaWierszowa = My.sumaWierszowa();
        for(int i = 0; i < sumaWierszowa.length; i++) {
            System.out.println(sumaWierszowa[i]);
        }
        System.out.println();
        
        System.out.println("Calkowita suma y");
        calkowitaSuma = My.calkowitaSuma();
        System.out.println(calkowitaSuma);
        System.out.println();
    }

}
