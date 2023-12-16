class L 
{
	L(int i)
	{
		System.out.println("L(int)");
	}

	L(int i)
	{
		System.out.println("L(int)");
	}

	public static void main(String[] args) 
	{
		L obj1 = new L(10);
		L obj2 = new L(10);
		System.out.println("done");
	}
}
