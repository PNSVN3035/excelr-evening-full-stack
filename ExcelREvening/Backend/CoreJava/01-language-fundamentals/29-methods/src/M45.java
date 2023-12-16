class M45
{
	public static void main(String[] args) 
	{
		int i = 10, j =20;
		System.out.println("main begin");
		test(i, j);
		System.out.println("main end");
	}
	static void test(int i, int j) //argument, parameter or signature 
	{
		int k = i, l = j;
		System.out.println("from test: " + k + ", "+ l);
	}
} 
 