class S
{
	private void test1()
	{
		System.out.println("from test1-S");
	}
}

class T extends S
{
	private void test1()
	//void test1()
	//protected void test1()
	//public void test1()
	{
		System.out.println("from test1-T");
	}

	public static void main(String[] args) 
	{
		T obj1 = new T();
		obj1.test1();
		System.out.println("done");
	}
}
