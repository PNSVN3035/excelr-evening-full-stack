class I
{
	void test1()
	{
		System.out.println("from test1-I");
	}
}

class J extends I
{
	int test1()
	{
		System.out.println("from test1-J");
		return 10;
	}

	public static void main(String[] args) 
	{
		J obj1 = new J();
		obj1.test1();
		System.out.println("done");
	}
}
