class D
{

	static int i = test(); 
	static int j; 

	static int test()
	{
		return j = 10;
	}

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
