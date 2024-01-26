package pack1;
class L
{
	int i;

	void test()
	{
		System.out.println("from test()");
	}
}

class M extends L
{
	public static void main(String[] args) 
	{
		M obj = new M();
		System.out.println(obj.i);
		obj.test();
	}
}
