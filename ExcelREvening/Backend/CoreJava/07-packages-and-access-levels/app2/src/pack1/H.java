package pack1;
class G
{
	private int i;

	private void test()
	{
		System.out.println("from test()");
	}
}

class H extends G
{
	
	public static void main(String[] args) 
	{
		H obj = new H();
		System.out.println(obj.i);
		obj.test();
	}
}
