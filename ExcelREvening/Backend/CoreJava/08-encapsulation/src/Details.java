class Person 
{
	private String name = "Prem";
	private int age = 26;
	private double salary = 150.0;

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setName(String na)
	{
		name = na;
	}

	public void setAge(int a)
	{
		age = a;
	}

	public void setSalary(double sa)
	{
		salary = sa;
	}
}

class Details
{
	public static void main(String[] args) 
	{
		Person person = new Person();
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSalary());
		person.setName("PK");
		person.setAge(27);
		person.setSalary(200.0);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSalary());
	}
}
