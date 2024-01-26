class O
{
	public void test()
	{
		System.out.println("from O test()");
	}

	O()
	{
		this.test();
	}

	{
		this.test();
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O obj = new O();
		System.out.println("main end");
	}
}
