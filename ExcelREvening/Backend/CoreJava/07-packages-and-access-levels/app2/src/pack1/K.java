package pack1;
class J
{
	int i;

	void test()
	{
		System.out.println("from test()");
	}
}

class K
{
	public static void main(String[] args) 
	{
		J obj = new J();
		System.out.println(obj.i);
		obj.test();
	}
}
