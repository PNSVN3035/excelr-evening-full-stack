class V
{
	@Deprecated
	void test1()
	{
	}
	void test2()
	{
	}

	//finalize is the inbuilt method which got deprecated in JDK 9.0
	//public void finalize()
	//{
	//}
}
class M18
{
	//to avoid the warnings by the compiler
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		V v1 = new V();
		v1.test1();
		v1.test2();
		System.out.println("done");
	}
}
