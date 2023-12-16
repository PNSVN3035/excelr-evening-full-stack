class P
{
	static
	{
		String s1 = "abc";
		System.out.println(s1);
		//field initialization before its declaration is possible
		i = 20; 
	}
	
	static int i = 10;

	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
