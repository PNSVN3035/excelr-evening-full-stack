class T 
{
	public static void main(String[] args)
	{
		String s1 = "abc" + 5 + 6;//string concatenation
		String s2 = 5 + "abc" + 6; //if one of the operand are string type. concatenation happens
		String s3 = 5 + 6 + "abc";  //both the operand are number type
		System.out.println(s1);//abc56
		System.out.println(s2);//5abc6
		System.out.println(s3);//11abc
	}
}
