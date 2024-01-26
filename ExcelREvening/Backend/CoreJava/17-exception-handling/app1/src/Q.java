class Q
{
	public static void main(String[] args) 
	{
		System.out.println("customer came asked for vegitable");
		try
		{
			System.out.println("checking veggies");
			int i = 10 / 0;
			System.out.println("veggies are good");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("bad condition veggies kept inside bin");
		}
		System.out.println("customer is happy with provided good veggies");
	}
}