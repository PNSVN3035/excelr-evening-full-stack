package pack1;
class E
{
	private int i;

	private void test()
	{
		System.out.println("from test()");
	}
}

class F
{
	
	public static void main(String[] args) 
	{
		E obj = new E();
		System.out.println(obj.i);
		obj.test();
	}
}
