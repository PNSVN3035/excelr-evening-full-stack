class N
{
	public static void main(String[] args) 
	{
		boolean b = true;
		switch(b)
		{
			 case true:
				System.out.println("from case true");
				break;
			case false:
				System.out.println("from case false");
				break;
			case true:
				System.out.println("from case true");
		}
	}
}