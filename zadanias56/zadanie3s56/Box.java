package zadanie3s56;

import java.io.IOException;

//import java.lang.Math;

public class Box {
    
    private double szerokosc = 0;
    private double wysokosc = 0;

    
    
    
    public Box() {
        super();
    }
    
    public Box(double sSzerokosc, double sWysokosc) throws IOException {
        if(sSzerokosc < 0 || sWysokosc <0) {
            throw new IOException("wymiary nie moga byc ujemne");
        }
        else
        {
            szerokosc = sSzerokosc;
            wysokosc = sWysokosc;
        }
    }
    
    public void setSzerokosc(double sSzerokosc) throws IOException {
        if(sSzerokosc < 0) {
            throw new IOException("szerokosc nie moze byc ujemna");
        }
        else
        {
            szerokosc = sSzerokosc;
        }
    }
    
    public double getSzerokosc() {
        return szerokosc;
    }
    
    public void setWysokosc(double sWysokosc) throws IOException {
        if(sWysokosc < 0) {
            throw new IOException("wysokosc nie moze byc ujemna");
        }
        else
        {
            wysokosc = sWysokosc;
        }
    }
    
    public double getWysokosc() {
        return wysokosc;
    }
    
    
    public Box joinDiagonal(Box b) throws IOException {
        
        szerokosc += b.getSzerokosc();
        wysokosc += b.getWysokosc();
        
        return new Box(szerokosc, wysokosc);
    }
    
    public Box joinHorizontal(Box b) throws IOException {
        
        szerokosc += b.getSzerokosc();
        wysokosc = Math.max(wysokosc, b.getWysokosc());
        
        return new Box(szerokosc, wysokosc);
    }
    
    public Box joinVertical(Box b) throws IOException {
        
        szerokosc = Math.max(szerokosc, b.getSzerokosc());
        wysokosc += b.getWysokosc();
        
        return new Box(szerokosc, wysokosc);
    }

}
