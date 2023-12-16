class I 
{
	I(int i)
	{
		System.out.println("I(int)");
	}

	I()
	{
		System.out.println("I()");
	}

	public static void main(String[] args) 
	{
		I obj1 = new I();
		I obj2 = new I(10);

		System.out.println("done");
	}
}
