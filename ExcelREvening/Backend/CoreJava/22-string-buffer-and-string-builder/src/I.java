class I 
{
	public static void main(String[] args) 
	{
		//adding 4 characters
		StringBuffer sb = new StringBuffer("1234567891123456");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("123456789112345678921234567893123");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		//removes extra capacity 
		//length and capacity becomes same
		//unoccupied locations will be removed and length and capacity bcms same 
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
