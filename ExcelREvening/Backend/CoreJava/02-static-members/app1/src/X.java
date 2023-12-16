class X
{
	static int i = test();  
	static int j = 20;  

	static int test()
	{
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	} 
}
