public class J
{
	static void test(Number j)
	{
		System.out.println("Number");
	}
	public static void main(String [] args)
	{
		byte i = 10; 
		short j = 20;
		int k = 30;
		long l = 40l;
		float m = 50.0f;
		double n = 60.0;
		test((byte)i);//new Byte((byte)10);
		test((short)j);
		test(k);
		test(l);
		test(m);
		test(n);
	}
}
	
