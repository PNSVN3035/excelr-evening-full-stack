class J 
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("from if");
			if(false)
			{
				System.out.println("if-if-block");
			}
			else
			{
				System.out.println("if-if-else-block");
			}
		}
		else
		{
			System.out.println("from else");
		}
		System.out.println("main end ");
	}
}
