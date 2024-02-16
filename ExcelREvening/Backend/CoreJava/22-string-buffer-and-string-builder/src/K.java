class K 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("vijay  kumar");
		System.out.println(sb);//vijay  kumar
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.deleteCharAt(5);
		System.out.println(sb);//vijay kumar
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.replace(6, 11, "excelr");
		System.out.println(sb);//vijay kumar
							   //01234567891  
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}                         

}
