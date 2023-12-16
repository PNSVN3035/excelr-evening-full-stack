class M47
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test((byte)127, (short)200, 300, 10.0f, 20.0, 'a', true, "hello");
		System.out.println("main end");
	}
	static void test(byte b, short s, int i, float j, double k, 
		char ch, boolean l, String str)    
	{
		System.out.println("from test: " + b + " " + s + " " + i +
			" " + j + " " + k + " " + ch + " " + l + " " + str);
	}
} 
 