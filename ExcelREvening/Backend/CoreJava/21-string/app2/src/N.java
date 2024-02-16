class N
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		//           01234
		char c1 = s1.charAt(0); //returns the char value at the 0th index
		char c2 = s1.charAt(3); //returns the char value at the 3rd index
		char c3 = s1.charAt(4); //returns the char value at the 4th index
		
		//char c4 = s1.charAt(-1);
		//char c5 = s1.charAt(5);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//System.out.println(c4);
		//System.out.println(c5);
	}
}
