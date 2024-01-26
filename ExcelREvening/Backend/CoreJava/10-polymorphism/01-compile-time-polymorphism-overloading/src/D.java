class D
{
	static String test(int i)
	{
		System.out.println("test(int)");
		return "abc";
	}

	static String test(int j)
	{
		System.out.println("test(String)");
		return "abc";
	}

	public static void main(String[] args) 
	{
		D.test(10);
		D.test(20);
		System.out.println("done");
	}
}
