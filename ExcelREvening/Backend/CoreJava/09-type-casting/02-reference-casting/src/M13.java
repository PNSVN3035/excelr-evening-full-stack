class M13
{
	public static void main(String[] args) 
	{
		Ancestor ancestor = new GrandFather();
		//explicitly down-casting, super type to sub-type
		GrandFather grandFather = (GrandFather)ancestor; 
		System.out.println("done");
	}
}
