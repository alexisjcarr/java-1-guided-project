package employeeApp;

public class Main
{
	public static void main(String[] args)
	{
		Healthplan h1 = new Healthplan("My Health Plan 1");
		Healthplan h2 = new Healthplan("My Health Plan 2");

		System.out.println(h1);

		Company c1 = new Company("Journal", 100);

		Employee emp1 = new Employee("Alexis", "Carr", 120000, true, c1.id, h1.getId());
		Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());

		System.out.println(emp1.getName());

		int myDebt = c1.debt;
		double mySalary = emp1.getSalary();

		System.out.println("divided by 5" + c1.debt / 5);
		System.out.println("divided by 7" + c1.debt / 7);
		System.out.println("divided by 7" + (double)c1.debt / 7); // yes
		System.out.println("divided by 7.0" + c1.debt / 7.0); // no
	}
}

