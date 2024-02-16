public class D
{
	@SuppressWarnings("removal")
	public static void main(String [] args)
	{
		int i = 10;
		new Integer(i);
		int j = new Integer(i);//auto-unboxing
		System.out.println("done");
	}
}
 