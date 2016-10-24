package seria4zadanie2;

public class Person {
	
	private String imie = "";
	
	Person()
	{		
	}
	
	Person(String sImie)
	{
		setImie(sImie);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String sImie) {
		imie = sImie;
	}
}
