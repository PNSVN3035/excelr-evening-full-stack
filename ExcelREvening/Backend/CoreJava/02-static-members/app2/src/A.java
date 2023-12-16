class A
{

	static int test1()
	{
		return 100;
	}

	static int sum = test1() + test2(); 
	
	static int test2()
	{
		return 200;
	}

	public static void main(String[] args) 
	{
		System.out.println(sum);
	}
}
