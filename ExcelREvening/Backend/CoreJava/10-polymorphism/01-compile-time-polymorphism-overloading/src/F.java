class F 
{
	private void test()
	{
		System.out.println("test()");
	}

	protected String test(int i)
	{
		System.out.println("test(int)");
		return "abc";
	}

	public String test(String str)
	{
		System.out.println("test(String)");
		return "xyz";
	}

	private char test(float f, double d)
	{
		System.out.println("test(float, double)");
		return 'a';
	}

	boolean test(char ch, String str, boolean b)
	{
		System.out.println("test(char, String, boolean)");
		return true;
	}

	public static void main(String[] args) 
	{
		F obj = new F();
		obj.test();
		obj.test(10);
		obj.test("abc");
		obj.test(10.0f, 20.0);
		obj.test('a', "abc", true);
		System.out.println("done");
	}
}
