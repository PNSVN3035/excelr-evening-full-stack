class K
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from if");
		}
		else
		{
			if(true)
			{
				System.out.println("from else block - if");
			}
			else
			{
				System.out.println("from else block - else");
			}
		}
		System.out.println("main end ");
	}
}
