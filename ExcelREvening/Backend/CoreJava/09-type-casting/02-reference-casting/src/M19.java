class M19 
{
	public static void main(String[] args) 
	{
		Ancestor ancestor = new GrandFather();
		System.out.println(ancestor instanceof Ancestor);
		System.out.println(ancestor instanceof GrandFather);
		System.out.println(ancestor instanceof Father);
		System.out.println(ancestor instanceof Son);
	}
}
