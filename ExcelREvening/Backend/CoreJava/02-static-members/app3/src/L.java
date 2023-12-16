class L 
{
	static
	{
		System.out.println("L-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("L-main-begin");
		System.out.println(I.x);
		J.test();
		System.out.println(K.b);
		System.out.println("L-main-end");

	}
}
