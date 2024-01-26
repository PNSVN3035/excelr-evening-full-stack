class K
{
	void test1()
	{
		System.out.println("from test1-I");
	}
}

class L extends K
{
	private void test1()
	{
		System.out.println("from test1-L");
	}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		obj1.test1();
		System.out.println("done");
	}
}
