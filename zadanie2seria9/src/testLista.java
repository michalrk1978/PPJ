package seria9z2;

import javax.swing.JOptionPane;

public class testLista
{
  public testLista()
  {
    super();
  }
  public static void main(String[] args)
  {
    List lista = new List();
    lista.init();
    JOptionPane.showMessageDialog(null, "rozmiar listy wynosi " + lista.getSize());
     JOptionPane.showMessageDialog(null, lista.showForward());
     JOptionPane.showMessageDialog(null, lista.showBackward());
     lista.changeAllSalaries(10);
    JOptionPane.showMessageDialog(null, lista.showForward());
    JOptionPane.showMessageDialog(null, lista.showBackward());

  }
}
