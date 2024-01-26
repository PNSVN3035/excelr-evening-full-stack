class C
{
	int i = 10;

	public String toString()
	{
		return i + "";
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("main begin: " + c1);
		try
		{
		}
		catch (ArithmeticException ex)
		{
		}
		System.out.println("main end");
	}
}
