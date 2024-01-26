abstract class J
{
	abstract void test1();
	abstract void test2();
	
	void test3()
	{
		System.out.println("from test3()");
	}
}

class K extends J
{
	void test1()
	{
		System.out.println("from test1()");
	}

	void test2()
	{
		System.out.println("from test2()");
	}

	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.test1();
		k1.test2();
		k1.test3();
		System.out.println("done");
	}
}
