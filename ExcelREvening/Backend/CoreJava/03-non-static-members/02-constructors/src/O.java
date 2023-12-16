class O 
{
	//type and no. of arguments must be different
	//if it is same we would get error
	O(int i, int j)
	{
		System.out.println("O(int, int)");
	}

	O(int k, double l)
	{
		System.out.println("O(int, int)");
	}

	public static void main(String[] args) 
	{
		O obj1 = new O(10, 20);
		O obj2 = new O(30, 40.0);
		System.out.println("done");
	}
}
