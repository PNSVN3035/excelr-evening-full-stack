class K
{
	static float test1(short s)
	{
		return test2(s);
	}

	static long test2(int i)
	{
		return i;
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		double d = test1(b);
		System.out.println("d: " + d + " done");
	}
}
