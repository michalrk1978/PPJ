package seria9z2;

import java.io.IOException;

import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class List
{
  private Emps head = null;
  private Emps end = null;
  private int size = 0;
  
  public void add(Emps emp) throws IOException
  {
    //Emps emp = new Emps(e.getEmployee(), null, null);
    if(emp == null) throw new IOException("Nie mozna dodac do listy pustego obiektu"); 
    if(head == null)
    {
      head = emp;
      end = emp;
      size++;
    }
    else
    if(head == end)
    {
      end.setNext(emp);
      end = emp;
      emp.setNext(null);
      emp.setPrev(head);
      size++;
    }
    else
    {
      end.setNext(emp);
      Emps temp = end.getPrev();
      end = emp;
      emp.setNext(null);
      emp.setPrev(temp.getNext());
      size++;
    }
  }
  
  public void init()
  {
    
    String wyrazenie = "";
    String ostrzezenie = "";
    String imie = null;
    String nazwisko = null;
    int wiek;
    double pensja;
    
    Scanner s; 
    wyrazenie = JOptionPane.showInputDialog(ostrzezenie + "Podaj imiê, nazwisko, wiek i Pensje pracownika" );
    while(wyrazenie!= null) 
    {
     s = new Scanner(wyrazenie).useDelimiter("[\\s,]+");
      
     try {
       imie = s.next();
       nazwisko = s.next();
       wiek = s.nextInt();
       pensja = s.nextDouble();
       
       Employee e = new Employee(imie, nazwisko, wiek, pensja); 
       Emps emp = new Emps(e, null, null);
       add(emp);
       
      
    } catch (NoSuchElementException exc) {
        ostrzezenie = "nie podano prawidlowego wyrazenia ";
    }
    catch(IOException exc)
    {
       ostrzezenie = exc.getMessage();
    }
      wyrazenie = JOptionPane.showInputDialog(ostrzezenie + "Podaj imiê, nazwisko, wiek i Pensje pracownika" );
    }
    
  }
  public int getSize()
  {
    return size;
  }
  
  public String showForward()
  {
    Emps pointer = head;
    String wynik = "";
    for(int i = 0; i < size; i++)
    {
      wynik += pointer.getEmployee().toString() + "\n";
      pointer = pointer.getNext();
    }
    return wynik;
  }
  
  public String showBackward()
  {
    Emps pointer = end;
    String wynik = "";
    for(int i = 0; i < size; i++)
    {
      wynik += pointer.getEmployee().toString() + "\n";
      pointer = pointer.getPrev();
    }
    return wynik;
  }
  
  void changeAllSalaries(double procent)
  {
    Emps pointer = end;
    for(int i = 0; i < size; i++)
    {
      pointer.getEmployee().zmienPensje(procent);
      pointer = pointer.getPrev();
    }
  }
   
  public List()
  {
  }
}
