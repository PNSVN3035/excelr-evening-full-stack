class P 
{
	P(int i)
	{
		this();
		System.out.println("P(int)");
	}

	P()
	{
		System.out.println("P()");
	}

	public static void main(String[] args) 
	{
		P obj1 = new P();
		P obj2 = new P(10);
		System.out.println("done");
	}
}
