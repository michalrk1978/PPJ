
class Main{
	
	public static void main(String[] args){
    
    System.out.printf("%5.3f %n",7.8976); 
   
     
	}
}

 class Para { 

  private int a;    // To s¹ "dane" (zwane polami klasy). 
                    // Okreœlaj¹ one z jakich elementów sk³adaæ siê
  private int b;    // bêd¹ obiekty tej klasy. 
                    // a = pierwszy sk³adnik pary, b - drugi

  public Para() {}

  public Para(int x, int y) {
    a = x;  
    b = y;
  }
 
  public Para(int x) {          // inny konstruktor: nadaje obu sk³adnikom pary
    a = b = x;                  // (a i b) tê sam¹ wartoœæ x
  } 


  public void set(Para p)  {    // metoda ustalenia wartoœci pary
    a = p.a;                    // na podstawie sk³adników przekazanej pary 
    b = p.b;
  } 

  public void set(int x, int y) {
    a = x;
    b = y; 
  }


  public Para add(Para p) {             // metoda dodawania dwóch par   
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

 
