class C
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = null;
		c1.i = 10;
		String s1 = null;
		int i = s1.length();
		System.out.println("main end");
	}
}
/* we cant able to call from the null reference otherwise
we get NullPointerException
*/
