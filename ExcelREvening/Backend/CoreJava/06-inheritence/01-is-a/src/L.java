class K
{
	int i;
	static int j;

	void test1()
	{
		System.out.println("from test1()");
	}

	static void test2()
	{
		System.out.println("from test2()");
	}
}

class L extends K 
{
	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println(obj.i);
		System.out.println(L.j);
		obj.test1();
		L.test2();
	}
}
