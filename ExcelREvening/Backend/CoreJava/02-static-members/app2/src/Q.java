class O
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from O begin");
		P.main(null);
		System.out.println("Hello World! from O end");
	}
}
class P
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from P begin");
		Q.main(null);
		System.out.println("Hello World! from P end");
	}
}
class Q
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from Q");
	}
}
