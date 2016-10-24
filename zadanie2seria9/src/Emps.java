package seria9z2;


public class Emps
{

  private Employee emp;
  private Emps next;
  private Emps prev;

  public Emps(Employee sEmp, Emps sNext, Emps sPrev)
  {
    next = sNext;
    prev = sPrev;
    emp = sEmp;
  }

  public Employee getEmployee()
  {
    return emp;
  }

  public Emps getNext()
  {
    return next;
  }

  public void setNext(Emps sNext)
  {
    next = sNext;
  }

  public Emps getPrev()
  {
    return prev;
  }

  public void setPrev(Emps sPrev)
  {
    prev = sPrev;
  }

  public Emps()
  {
    next = null;
    prev = null;
  }
}
