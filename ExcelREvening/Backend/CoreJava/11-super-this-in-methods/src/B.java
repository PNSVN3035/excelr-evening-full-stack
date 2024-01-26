class A 
{
	public void test()
	{
		System.out.println("from A test()");
	}
}

class B extends A
{
	public void test(int i)
	{
		super.test();
		System.out.println("from B test(int)");
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}
