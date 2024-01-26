package pack1;
class Q
{
	private Q()
	{
		System.out.println("Q()");
	}
}
class R extends Q
{
	public static void main(String[] args) 
	{
		R obj = new R();
		System.out.println("done");
	}
}
