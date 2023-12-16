class M 
{
	M(int i)
	{
		System.out.println("M(int)");
	}

	M(double i)
	{
		System.out.println("M(double)");
	}

	public static void main(String[] args) 
	{
		M obj1 = new M(10);
		M obj2 = new M(10.0);
		System.out.println("done");
	}
}
