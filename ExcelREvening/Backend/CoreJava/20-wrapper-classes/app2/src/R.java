public class R
{
	static void test()
	{
		System.out.println("test()");
	}

	static void test(int i)
	{
		System.out.println("test(int)");
	}
	//var arg, any no. of int arg can be supplied, even 0 no. also
	//var arg introduced in JDK 1.5
	static void test(double i, String j, int ... arg)
	{
		System.out.println("test(double, String, var-args)");
	}
	public static void main(String [] args)
	{
		test();
		test(10);
		test(20.0, "abc", 10, 30);
		test(40.0, "xyz", 50, 90, 100);
		test(80.0, "test", 90, 10, 20, 40);
	}
}
