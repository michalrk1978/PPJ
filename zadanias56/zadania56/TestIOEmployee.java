package zadanie1s56;

class TestIOEmployee {

	public static void main(String[] args)
	{
		Employee em1 = IOEmployee.defEmp("Pracownik 1");
		IOEmployee.showInfo(em1);
		IOEmployee.changeSalary(em1);
		IOEmployee.showInfo(em1);


		Employee em2 = IOEmployee.defEmp("Pracownik 2");
		IOEmployee.showInfo(em2);
		IOEmployee.changeSalary(em2);
		IOEmployee.showInfo(em2);

		Employee em3 = IOEmployee.defEmp("Pracownik 3");
		IOEmployee.showInfo(em3);
		IOEmployee.changeSalary(em3);
		IOEmployee.showInfo(em3);

	}
}
