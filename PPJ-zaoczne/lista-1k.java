//Lista jednokierunkowa jest sekwencj� element�w umieszczonych 
//w r�nych obszarach pami�ci w og�lno�ci nie s�siaduj�cych ze sob�.
//�eby zapewni� powi�zanie mi�dzy elementami ka�dy element zawiera opr�cz
//przechowywanego obiektu (pole data)r�wnie� referencj� do nast�pnego elementu(pole next).
//Ostatni element ma referencj� typu null wskazuj�c� �e nie ma nast�pnych element�w
//Do listy mamy dost�p poprzez referencj� do pierwszego elementu (pole head) 
//od kt�rego mo�emy porusza� si� po li�cie w jednym kierunku do ostatniego elementu.

class Main {
	
  public static void main(String[] args)
  {
  	System.out.println("//tworzy pust� list�");  	
  	Lista lista= new Lista();
  	System.out.println("-------------------");
    lista.show();
    System.out.println("-------------------");  
       
    System.out.println("//dodaje na pocz�tek data1");     	    
  	lista.addFirst("data1");
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//dodaje na pocz�tek data2");  	
  	lista.addFirst("data2");
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//dodaje na pocz�tek data3");  	
  	lista.addFirst("data3");  	
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//dodaje na koniec data4");  	  	
  	lista.addLast("data4");
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");  	 
  	
  	System.out.println("//dodaje na koniec data5");
  	lista.addLast("data5");
  	System.out.println("-------------------");
  	lista.show();  	
  	System.out.println("-------------------");
  	
  	System.out.println("//dodaje na koniec data6");  	
  	lista.addLast("data6");
  	System.out.println("-------------------");
  	lista.show();  	
  	System.out.println("-------------------");
  	  	
  	System.out.println("//usuwa pierwszy");  	 
  	lista.removeFirst();
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//usuwa ostatni");
  	lista.removeLast();
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	  	
  	System.out.println("//usuwa pierwszy");  	
  	lista.removeFirst();
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//usuwa ostatni");
  	lista.removeLast();
  	System.out.println("-------------------");
  	lista.show();  	
  	System.out.println("-------------------");
  	
  	System.out.println("//usuwa pierwszy");
  	lista.removeFirst();
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//usuwa ostatni");
  	lista.removeLast();  	
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
    System.out.println("//wstawia data10 na poz.1 ");	    
  	lista.insert(1,"data10");
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  		
  	System.out.println("//wstawia data11 na poz.2");  	
  	lista.insert(2,"data11");
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//wstawia data12 na poz.1 ");  
  	lista.insert(1,"data12");
  	System.out.println("-------------------");
  	lista.show();
  	System.out.println("-------------------");
  	
  	System.out.println("//wstawia data14 na poz.2 ");  	
  	lista.insert(2,"data14");
  	System.out.println("-------------------");
  	lista.show();	
  	System.out.println("-------------------");
  	
    System.out.println("//usuwa element-1 ");
    lista.remove(1);
    System.out.println("-------------------");
    lista.show();
    System.out.println("-------------------");
    
    System.out.println("//usuwa element-2 ");		    
    lista.remove(2);
    System.out.println("-------------------");
    lista.show();
    System.out.println("-------------------");
    
    System.out.println("//usuwa element-1 ");
    lista.remove(1);
    System.out.println("-------------------");
    lista.show();
    System.out.println("-------------------");
    
    System.out.println("//usuwa element-1 ");
    lista.remove(1);
    System.out.println("-------------------");
    lista.show();
    System.out.println("-------------------");
  }
  
}//class Main	
	
class Lista {
	
  Element head;	
	
  public Lista(){}	
  
  //dodaje na pocz�tek listy	  
  public void addFirst(Object data)
  {  	  	
  	if(head==null)head=new Element(data,null);	  	  	  	
  	else head = new Element(data,head);	  	  	  	    	    		 
  	  	
  }//addFirst()	
  
  //dodaje na koniec listy
  public void addLast(Object data)
  {
  	Element temp;
  	 
  	if(head==null)head=new Element(data,null);  	    		  	
  	else{  		
  	  temp=head;	
  	  while(temp.next!=null)temp=temp.next;  	  
  	  temp.next=new Element(data,null);	  		
  	}  	
  	
  }//addLast()
  
  //usuwa pierwszy element listy
  public void removeFirst()
  {  	
  	if(head==null)System.out.println("Lista jest pusta");
  	else head=head.next;	  		  	  	  		  		
    		
  }//removeFirst()
  
  //usuwa ostatni element listy
  public void removeLast()
  {
  	Element temp;
  	if(head==null){
  	  System.out.println("Lista jest pusta");
  	  return;
  	}
  	if(head.next==null)head=null;
  	else {
  	  temp=head;
  	  while(temp.next.next!=null)temp=temp.next;
  	  temp.next=null;	  		
  	}
  	  	
  }//removeLast()
  
  //wstawia element zawieraj�cy obiekt data na pozycj� p
  public void insert(int p,Object data)
  {
  	Element temp;
  	
  	if(head==null)head=new Element(data,null);
  	else{
  	  if(p==1)head=new Element(data,head);
  	  else{	
  	    temp=head;
  	    int nr=1;
  	    while(nr<p-1){temp=temp.next;nr++;}
  	    temp.next=new Element(data,temp.next);  	    	  	  		
      }
    }
     
  }//insert()
  
  //usuwa element z pozycji p
  public void remove(int p)
  {
  	Element temp;
  	
    if(head==null){
    	System.out.println("Lista jest pusta");  	
    	return;
   	}
    else{
      if(p==1)head=head.next;
      else{
        temp=head;
        int nr=1;
        while(nr<p-1){temp=temp.next;nr++;}
        temp.next=temp.next.next;        	
      }	
    }
    
  }//remove()
  
  //podaje rozmiar listy (ilo�� element�w)  
  public int getSize()
  {
  	Element temp;
  	if(head==null)return 0;
  	temp=head;
  	int nr=1;
  	while(temp.next!=null){nr++;temp=temp.next;}  	
  	
  	return nr;
  	  	  	
  }//getSize()
    
  //prezentuje list� na konsoli  
  public void show()
  {
  	int nr=0;
  	
  	if(head==null)System.out.println("Lista jest pusta");
  	else {
  	  Element temp=head;	  	  	  
      while(temp!=null){
      	nr++;
        System.out.println("nr="+nr+" data= "+temp.data);
        temp=temp.next;  		  		          		
	  }	  		  		  		  			  
  	}
  	System.out.println("SIZE = "+nr);	  	
  	
  }//show()        
  			
}//class Lista
	
class Element {
   
  Element next;	  
  Object data;
	
  public Element(Object data,Element next)
  {
    this.next=next;
    this.data=data;	   	
  }			
}//class Element		
