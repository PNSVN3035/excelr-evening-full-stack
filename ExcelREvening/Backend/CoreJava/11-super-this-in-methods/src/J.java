class I
{
	static int i;
	boolean k;
}

class J extends I
{
	J()
	{
		System.out.println("J() begin");
		System.out.println(super.i);  //this is super reference. we kept anywhere
		System.out.println(super.k);
		System.out.println("J() end");
	}

	{
		System.out.println("J-IIB begin");
		System.out.println(super.i);
		System.out.println(super.k);
		System.out.println("J-IIB end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		J obj = new J();
		System.out.println("main begin");
	}
}
