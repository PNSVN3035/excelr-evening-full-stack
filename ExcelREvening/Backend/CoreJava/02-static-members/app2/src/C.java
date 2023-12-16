class C
{

	static int i = test(); 
	static int j; 

	static int test()
	{
		return j;
	}

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
