class K
{
	public void test()
	{
		this.test(10);
		System.out.println("from K test()");
	}

	public void test(int i)
	{
		System.out.println("from K test(int)");
	}

	public static void main(String[] args) 
	{
		K obj = new K();
		obj.test();
		System.out.println("done");
	}
}
