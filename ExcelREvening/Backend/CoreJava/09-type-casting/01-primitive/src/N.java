class N
{
	static void test1(double d)
	{
		System.out.println("from test(double)");
	}

	public static void main(String[] args) 
	{
		int i = 10;
		test1(i); //auto Up-Casting
		System.out.println("-------------");
		test1((double)i); //Manual Up-Casting
		System.out.println("-------------");
	}
}
