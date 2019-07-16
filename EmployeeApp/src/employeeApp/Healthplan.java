package employeeApp;

public class Healthplan
{
	// Fields, state of the class, attributes
	private static int maxId = 0;
	private int id;
	private String name;

	// constructor
	public Healthplan(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
	}

	// Methods, behaviors
	// getters and setters
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		String rtnStr = "id: " + id + "\n" +
						"name: " + name + "\n";
		return rtnStr;
	}
}
