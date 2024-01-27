interface S
{
	int i = 10;
	void test1();
}
enum T implements S
{
	CON1, CON2, CON3;

	public void test1()
	{
		System.out.println("from test1");
	}

	public int test2()
	{
		return i;
	}
}
class Z
{
	public static void main(String[] args)
	{
		T t1 = T.CON1;
		t1.test1();
		System.out.println(t1.test2());
	}
}