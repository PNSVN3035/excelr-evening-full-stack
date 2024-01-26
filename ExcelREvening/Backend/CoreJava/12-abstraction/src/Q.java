abstract class O
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

abstract class P extends O
{
	void test1()
	{
		System.out.println("from test1()");
	}

	void test2()
	{
		System.out.println("from test2()");
	}

	void test3()
	{
		System.out.println("from test3()");
	}

	abstract void method1();
}

class Q extends P
{
	void method1()
	{
		System.out.println("from method1()");
	}
	
	public static void main(String[] args) 
	{
		Q obj = new Q();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.method1();
		System.out.println("done");
	}
}
