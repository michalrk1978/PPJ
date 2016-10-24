package zadanie1s56;

public class TestEmployee {
    
    public static void main(String[] args) {
        
            Employee emp1 = new Employee("Jan", "Kowalski", 55, 2500);
            System.out.println(emp1);
            Employee emp2 = new Employee("Maciej", "Nowak", 33, 2300);
            System.out.println(emp2);
            emp2.zmienPensje(10);
            System.out.println(emp2);
            emp1.zmienPensje(5);
            System.out.println(emp1);
        
    }
}
