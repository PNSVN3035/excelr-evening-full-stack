class A 
{
	static int add(int i, int j)
	{
		return i + j;
	}

	static int add(int i, int j, int k)
	{
		return i + j + k;
	}

	static int add(int i, int j, int k, int l)
	{
		return i + j + k + l;
	}

	public static void main(String[] args) 
	{
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,30,40));
		System.out.println("done");
	}
}
