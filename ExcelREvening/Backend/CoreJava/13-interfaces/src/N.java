interface M
{
	void test1();
	int test2(int i);
}

class N implements M
{
	public void test1()
	{
		System.out.println("from test1()");
	}

	public int test2(int i)
	{
		System.out.println("from test2(int)");
		return 0;
	}

	public static void main(String[] args) 
	{
		N obj2 = new N();
		obj2.test1(); 
		obj2.test2(10); 
	}
}
