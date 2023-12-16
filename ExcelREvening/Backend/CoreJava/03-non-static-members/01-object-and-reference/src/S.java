class S 
{
	int i;

	static void test(int i)
	{
		System.out.println("from test(int) begin: " + i);
		i = 20;
		System.out.println("from test(int) end: " + i);
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("main begin: " + s1.i);
		s1.i = 10;
		System.out.println("before test(int): " + s1.i);
		test(s1.i);
		System.out.println("after test(int):: " + s1.i);
	}
}
