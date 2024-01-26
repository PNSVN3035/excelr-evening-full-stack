class C
{
	static void fielder() throws ClassNotFoundException
	{
		Class.forName("");
	}

	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("main begin");
		fielder();
		System.out.println("main end");
	}
}
