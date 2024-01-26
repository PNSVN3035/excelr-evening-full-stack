class U
{
	public static void test1()
	{
		System.out.println("from test1.U");
	}
}

class V extends U
{
	public static void test1()
	{
		System.out.println("from test1.V");
	}

	public static void main(String[] args) 
	{
		V obj1 = new V();
		obj1.test1();
		System.out.println("done");
	}
}
