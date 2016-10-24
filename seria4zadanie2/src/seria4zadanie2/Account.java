package seria4zadanie2;

public class Account {
	
		double balance;
		static double rata;
		
		public Account()
		{			
			this(0,0);
		}
		
		public Account(double sBalance, double sRata)
		{
			balance = sBalance;
			rata = sRata;
		}
	
		public void deposit(double wplata)
		{
			balance += wplata;
		}
		
		public void withdraw(double wyplata)
		{
			balance -= wyplata;
		}
		
		public void transfer(Account konto, double kwota)
		{
			konto.balance += kwota;
			balance -= kwota;
		}
		
		public static void setInterestRate(double sRata)
		{
			rata = sRata;
		}
		
		public void addInterest()
		{
			balance += rata * 0.01 * balance;
		}
		
		public String toString()
		{
			return " stan konta " + balance;
		}

}
// dodalem komentarz