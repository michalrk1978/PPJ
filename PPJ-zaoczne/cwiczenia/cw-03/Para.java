
class Main{
	
	public static void main(String[] args){
    
    System.out.printf("%5.3f %n",7.8976); 
   
     
	}
}

 class Para { 

  private int a;    // To s� "dane" (zwane polami klasy). 
                    // Okre�laj� one z jakich element�w sk�ada� si�
  private int b;    // b�d� obiekty tej klasy. 
                    // a = pierwszy sk�adnik pary, b - drugi

  public Para() {}

  public Para(int x, int y) {
    a = x;  
    b = y;
  }
 
  public Para(int x) {          // inny konstruktor: nadaje obu sk�adnikom pary
    a = b = x;                  // (a i b) t� sam� warto�� x
  } 


  public void set(Para p)  {    // metoda ustalenia warto�ci pary
    a = p.a;                    // na podstawie sk�adnik�w przekazanej pary 
    b = p.b;
  } 

  public void set(int x, int y) {
    a = x;
    b = y; 
  }


  public Para add(Para p) {             // metoda dodawania dw�ch par   
    Para wynik = new Para(a, b);
    wynik.a += p.a;
    wynik.b += p.b;
    return wynik;
  }
  
  public boolean equals(Object o) {
    if (!(o instanceof Para)) return false;
    Para p = (Para) o;
    return a == p.a && b == p.b;
  }

                               
  public String toString()  {                 
    return " ( " + a + " , " + b + " )";
  }

}

 
