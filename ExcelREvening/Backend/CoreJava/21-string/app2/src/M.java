class M
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		System.out.println(s1.length());
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n------------");
		char[] chars = s1.toCharArray();// built in method
		for(int i = 0; i < chars.length; i++)
		{
			System.out.print(chars[i]);
		}
	}
}
