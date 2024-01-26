class Eclairs 
{
	private String smallChocolate = "choco";

	public String getSmallChocolate()
	{
		return smallChocolate;
	}

	public void setSmallChocolate(String ingredient)  //allowing the writing access
	{
		smallChocolate = ingredient;
	}

}

class Paris
{
	public static void main(String[] args) 
	{
		Eclairs eclairs = new Eclairs();
		//System.out.println(eclairs.smallChocolate);
		System.out.println(eclairs.getSmallChocolate());
		eclairs.setSmallChocolate("salt"); //passing the value in place of choco
		System.out.println(eclairs.getSmallChocolate());
	}
}
