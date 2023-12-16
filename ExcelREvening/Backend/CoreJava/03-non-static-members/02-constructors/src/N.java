class N 
{
	N(int i, int j)
	{
		System.out.println("N(int, int)");
	}

	N(int k, int l)
	{
		System.out.println("N(int, int)");
	}

	public static void main(String[] args) 
	{
		N obj1 = new N(10, 20);
		N obj2 = new N(30, 40);
		System.out.println("done");
	}
}
