class H
{
	public void test()
	{
		System.out.println("from H test()");
	}
}

class I extends H
{
	public void test(int i)
	{
		System.out.println("from I test(int)");
	}

	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}
