class F
{
	public static void main(String[] args)
	{	
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1)); //we can shuffle
		
		String s3 = new String("hello");
		String s4 = new String("welcome");
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s3)); //we can shuffle
	}
}