class E
{
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("from E main");
		
	}
}

class F extends E
{
	static int j;

	static
	{
		F.main(null);
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println(f1.j);
		System.out.println("------------");
		System.out.println(F.i);
		System.out.println(F.j);
	}
}
