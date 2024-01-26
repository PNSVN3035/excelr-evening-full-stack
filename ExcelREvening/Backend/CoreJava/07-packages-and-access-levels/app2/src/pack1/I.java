package pack1;
class I
{
	int i;

	void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) 
	{
		I obj = new I();
		System.out.println(obj.i);
		obj.test();
	}
}
