public class D
{
	//suitable type
	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String [] args)
	{
		int i = 10;
		test(i);
	}
}
	
