class V 
{
	public static void main(String[] args) 
	{
		String s1 = "java technologies";
		//			 01234567891123456
		System.out.println(s1.length());
		String s2 = s1.substring(5, s1.length());//Returns a string that is a substring of this string
		//int i = s1.indexOf('s');
		//if the beginIndex is negative
		//String s3 = s1.substring(-5, s1.length());
		//endIndex is larger than the length of this String object
		//String s4 = s1.substring(5, 30);
		//beginIndex is larger than endIndex.
		//String s5 = s1.substring(18, 17);
		System.out.println(s1);
		System.out.println(s2);
	}
}
