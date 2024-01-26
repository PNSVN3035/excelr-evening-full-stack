package pack1;
class B
{
	private void test1()
	{
		System.out.println("from test1()");
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		System.out.println("done");
	}
}
