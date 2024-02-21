package pack1;
class Test32
{
	static <T> void test (T obj1, T obj2)
	{
	}
}
class M64
{
	public static void main(String[] args)
	{
		Test32.test(100, 200);
		Test32.test("abc", "xyz");
		System.out.println("done");	
	}
}