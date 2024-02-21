interface A
{
	int test();
}
class M6
{
	public static void main(String[] args) 
	{
		//if method body contains only return value then return statement is not allowed
		A a2 = () -> 2000;
		int i = a2.test();
		System.out.println(i);
	}
}
