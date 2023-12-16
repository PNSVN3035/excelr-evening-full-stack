class D 
{
	int i;

	D()
	{
		i = 10;
		System.out.println("D()");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		System.out.println("done");
	}
}
