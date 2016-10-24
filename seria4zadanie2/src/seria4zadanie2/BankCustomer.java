package seria4zadanie2;

public class BankCustomer extends Person 
{
	
	private Account konto = new Account(0,0);
	
	public BankCustomer(Person p)
	{
		this.setImie(p.getImie());
	}
	
	public Account getAccount()
	{
		return konto;
	}
	
	public void setAccount(Account sKonto)
	{
		konto = sKonto;
	}
	
	public String toString()
	{
		return "Klient: " + this.getImie() + konto.toString();
	}
}
