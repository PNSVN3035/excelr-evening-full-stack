class M15 
{
	static Father test()
	{
		Ancestor ancestor = new Son();
		return ancestor;
	}

	public static void main(String[] args) 
	{
		Son son = test();
		System.out.println("done");
	}
}
