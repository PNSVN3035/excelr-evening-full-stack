class F
{
	int i;

	F(int k) 
	{
		i = k;
		System.out.println("F(int): " + k);
	}

	public static void main(String[] args) 
	{
		F f1 = new F(10);
		System.out.println("done: " + f1.i);
	}
}
