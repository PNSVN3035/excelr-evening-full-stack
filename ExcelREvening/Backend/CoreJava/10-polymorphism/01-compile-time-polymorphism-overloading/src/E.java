class E 
{
	void test()
	{
		System.out.println("test()");
	}

	String test(int i)
	{
		System.out.println("test(int)");
		return "abc";
	}

	String test(String str)
	{
		System.out.println("test(String)");
		return "xyz";
	}

	public static void main(String[] args) 
	{
		E obj = new E();
		obj.test();
		obj.test(10);
		obj.test("abc");
		System.out.println("done");
	}
}
