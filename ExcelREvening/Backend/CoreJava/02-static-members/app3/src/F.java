class E
{
	static int i = 10;

	static 
	{
		System.out.println("E-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("E-main");
	}
}

class F
{
	static
	{
		System.out.println("F-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("F-main-begin");
		System.out.println(E.i);
		System.out.println(E.i);
		System.out.println(E.i);
		System.out.println(E.i);
		System.out.println("F-main-end");

	}
}
