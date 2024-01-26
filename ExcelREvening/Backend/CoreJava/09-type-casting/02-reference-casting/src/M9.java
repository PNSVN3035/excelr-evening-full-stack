class M9 
{
	static void test(Ancestor ancestor)
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		test(new GrandFather()); 
		test(new Father());
		test(new Son());
		GrandFather grandFather = new GrandFather();
		/*we are supplying grandFathe to ancestor, this means where ever 
		grandFather is pointing, ancestor also pointing*/
		test(grandFather);
		Father father = new Father();
		test(father);
		Son son = new Son();
		test(son);
		System.out.println("done");
	}
}
