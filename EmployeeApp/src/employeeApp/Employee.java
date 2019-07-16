package employeeApp;

public class Employee 
{
	// Fields, state of the class, attributes
	private static int maxId = 0;
	private int id;
	private String fname;
	private String lname;
	private double salary;
	private boolean has401K;
	private int companyID;
	private int healthPlanID;

	// constructor

	public Employee(String fname, String lname, double salary, boolean has401K, int companyID, int healthPlanID)
	{
		maxId++;
		id = maxId;

		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.has401K = has401K;
		this.companyID = companyID;
		this.healthPlanID = healthPlanID;
	}

	// Methods, behaviors
	// getters and setters
	public int getId()
	{
		return id;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) 
	{
		this.lname = lname;
	}

	   public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public boolean getHas401K()
    {
        return has401K;
    }

    public void setHas401K(boolean has401K)
    {
        this.has401K = has401K;
    }

    public int getCompanyID()
    {
        return companyID;
    }

    public void setCompanyID(int companyID)
    {
        this.companyID = companyID;
    }

    public int getHealthPlanID()
    {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID)
    {
        this.healthPlanID = healthPlanID;
    }

    public String getName()
    {
    	return fname + " " + lname;
    }
}