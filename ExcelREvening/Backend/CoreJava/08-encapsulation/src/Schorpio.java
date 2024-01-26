class Thor 
{
	private String Twodoor = "Black";

	public String getTwodoor()
	{
		return Twodoor;
	}

	public void setTwodoor(String color)
	{
		Twodoor = color;
	}
}

class Schorpio
{
	public static void main(String[] args) 
	{
		Thor t1 = new Thor();
		System.out.println(t1.getTwodoor());
		t1.setTwodoor("White");
		System.out.println(t1.getTwodoor());
	}
}
