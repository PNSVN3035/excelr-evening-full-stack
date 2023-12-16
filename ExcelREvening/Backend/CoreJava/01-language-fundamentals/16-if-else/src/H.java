class H
{
	public static void main(String[] args) 
	{
		if(true)
		{
			System.out.println("outer-if-begin");
			if(false)
			{
				System.out.println("inner if");
			}
			System.out.println("outer-if-end");

		}
		
	}
}
