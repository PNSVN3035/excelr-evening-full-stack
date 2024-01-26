class C
{
	public void test()
	{
		System.out.println("from C test()");
	}
}

class D extends C
{
	public void test(int i)
	{
		System.out.println("from D test(int) begin");
		super.test();
		System.out.println("from D test(int) end");
	}

	public static void main(String[] args) 
	{
		D obj = new D();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}
