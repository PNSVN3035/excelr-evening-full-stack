class A 
{
	void test()
	{
		System.out.println("from test-A");
	}
}

class B extends A
{
	void test()
	{
		System.out.println("from test-B");
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
