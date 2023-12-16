class H 
{
	H(int i)
	{
		System.out.println("H(int)");
	}

	H()
	{
		System.out.println("H()");
	}

	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println("done");
	}
}
