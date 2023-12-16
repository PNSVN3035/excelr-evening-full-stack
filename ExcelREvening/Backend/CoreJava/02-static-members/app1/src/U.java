class U
{
	static int i = j;  // illegal forward reference
	static int j;  

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
