package employeeApp;

public class Company
{
	private static int maxId = 0;
	public final static double match401K = 0.05;

	public int id; // if
	public String name; // name of the company
	public int debt; // with this set public, you don't need getters and setters

	public Company(String name, int debt)
	{
		maxId++;
		id = maxId; 

		this.name = name;
		this.debt = debt;
	}
}