class Y
{
	static String str1 = test1();  
	static String str2 = test2();  

	static String test1()
	{
		return "Study";
	}

	public static void main(String[] args) 
	{
		System.out.println(str1 + " " + str2);
	}

	static String test2()
	{
		return "Hard";
	}
}
