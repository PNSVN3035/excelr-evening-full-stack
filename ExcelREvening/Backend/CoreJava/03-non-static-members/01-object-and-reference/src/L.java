class L
{
	void test()
	{
		System.out.println("from test()");
	}

	static 
	{
		L obj = new L();
		obj.test();
	}
}
