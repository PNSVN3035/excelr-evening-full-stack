class Q 
{
	Q()
	{
		this(10);
		System.out.println("Q()");
	}

	Q(int i)
	{
		this(true);
		System.out.println("Q(int)");
	}

	Q(boolean i)
	{
		this(10,20);
		System.out.println("Q(boolean)");
	}

	Q(int i, int j)
	{
		this(i, j, 30);
		System.out.println("Q(int, int)");
	}

	Q(int i, int j, int k)
	{
		System.out.println("Q(int, int, int)");
	}

	public static void main(String[] args) 
	{
		Q obj1 = new Q();
		System.out.println("-----------");
		Q obj2 = new Q(10);
		System.out.println("-----------");
		Q obj3 = new Q(false);
		System.out.println("-----------");
		Q obj4 = new Q(100, 200);
		System.out.println("-----------");
		Q obj5 = new Q(400, 600, 800);
		System.out.println("done");
	}
}
