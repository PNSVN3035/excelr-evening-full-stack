@FunctionalInterface
interface D
{
	void test1();
}
class E implements D
{
	public void test1()
	{
		System.out.println("test1()");
	}
}